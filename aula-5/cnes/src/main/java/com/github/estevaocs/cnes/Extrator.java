package com.github.estevaocs.cnes;

import com.google.gson.Gson;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public final class Extrator {

    private static final String FILENAME = "tbEstabelecimento";

    private static final String SPLITTER = ";";

    private static final short CODIGO = 0;

    private static final short RAZAO = 5;

    private static final short LATITUDE = 39;

    private static final short LONGITUDE = 40;

    private static BufferedReader rd = null;

    private static ArrayList<Unidade> unidades = null;

    public static void main(final String[] args) {
        URL cnesUrl = null;
        URLConnection con = null;
        ZipInputStream zipStream;
        ZipEntry entry;
        verificaArgumentos(args);
        cnesUrl = setURL(args, cnesUrl);
        con = abrirConeccao(cnesUrl, con);
        try {
            zipStream = new ZipInputStream(con.getInputStream());
            File file = File.createTempFile("cnes", ".zip");
            ZipFile zipFile = new ZipFile(file);
            while ((entry = zipStream.getNextEntry()) != null) {
                if (!entry.getName().contains(FILENAME)) {
                    continue;
                }
                rd = new BufferedReader(
                        new InputStreamReader(zipFile.getInputStream(entry)));
                tratadorCSV();
                rd.close();
                break;
            }
            file.deleteOnExit();
            zipFile.close();
            geradorGson(args[1]);
            System.out.println("Arquivo gson " + args[1] + " concluido");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(3);
        }
    }

    private static URLConnection abrirConeccao(URL cnesUrl, URLConnection con) {
        try {
            con = cnesUrl.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }
        return con;
    }

    private static URL setURL(String[] args, URL cnesUrl) {
        try {
            cnesUrl = new URL(args[0]);
        } catch (MalformedURLException e) {
            System.out.println("Erro na URL");
            System.exit(1);
        }
        return cnesUrl;
    }

    private static void verificaArgumentos(String[] args) {
        if (args.length < 2) {
            System.out.println("Informe os argumentos necessários");
            System.exit(3);
        }
    }


    private static void tratadorCSV() throws IOException {
        String line;
        String[] split;
        while ((line = rd.readLine()) != null) {
            split = line.split(SPLITTER);
            unidades.add(new Unidade(split[CODIGO], split[RAZAO],
                    split[LATITUDE], split[LONGITUDE]));
        }
    }

    private static void geradorGson(final String nome) throws IOException {
        FileWriter writer = new FileWriter("./" + nome);
        Gson gson = new Gson();
        gson.toJson(unidades, writer);
    }
}

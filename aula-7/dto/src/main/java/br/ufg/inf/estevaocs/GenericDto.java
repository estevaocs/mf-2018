package br.ufg.inf.estevaocs;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Path;

public class GenericDto implements DtoInterface {


    protected static <T> T fromJson(String json, Class<?> src) {
        Gson gson = new Gson();
        return gson.fromJson(json, (Type) src);
    }

    protected static <T> T fromJson(File file, Class<?> src) throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader wr = new JsonReader(new FileReader(file));
        return gson.fromJson(wr, src);
    }

    public String toJson() throws IOException {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public void toJson(String path) throws IOException {
        Gson gson = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        gson.toJson(this, writer);
        writer.close();
    }

    public void toJson(Path path) throws IOException {
        Gson gson = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()));
        gson.toJson(this, writer);
        writer.close();
    }

    public void toJson(File file) throws IOException {
        Gson gson = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getName()));
        gson.toJson(this, writer);
        writer.close();
    }

    protected static <T> T fromXml(String xml, Class<?> src) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(src);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader rd = new StringReader(xml);
        return (T) unmarshaller.unmarshal(rd);
    }

    protected static <T> T fromXml(File xml, Class<?> src) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(src);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Reader rd = new FileReader(xml);
        return (T) unmarshaller.unmarshal(rd);
    }

    public String toXml() throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        Writer sw = new StringWriter();
        marshaller.marshal(this, sw);
        return sw.toString();
    }

    public void toXml(String path) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        Writer fw = new FileWriter(path);
        marshaller.marshal(this, fw);
        fw.close();
    }

    public void toXml(Path path) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        Writer fw = new FileWriter(path.toString());
        marshaller.marshal(this, fw);
        fw.close();
    }

    public void toXml(File file) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        Writer fw = new FileWriter(file.getPath());
        marshaller.marshal(this, fw);
        fw.close();
    }

}

package br.ufg.inf.estevaocs;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.lang.reflect.Type;

public class GenericDto<T> implements DtoInterface {


    protected static <T> T fromJson(String json, Class<?> src) {
        Gson gson = new Gson();
        return gson.fromJson(json, (Type) src);
    }

    protected static <T> T fromJson(File file, Class<?> src) throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader wr = new JsonReader(new FileReader(file));
        return (T) gson.fromJson(wr, src);
    }

    public String toJson() throws IOException {
        Gson gson = new Gson();
        String className = this.getClass().getName().replace(this.getClass().getPackageName()+".", "");
        String fileName = "out/json/" + className + ".json";
        String json = gson.toJson(this);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        gson.toJson(this, writer);
        writer.close();
        return json;
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
        String className = this.getClass().getName().replace(this.getClass().getPackageName() + ".", "");
        String fileName = "out/xml/" + className + ".xml";
        Writer fw = new FileWriter(fileName);
        Writer sw = new StringWriter();
        marshaller.marshal(this, fw);
        fw.close();
        marshaller.marshal(this, sw);
        return sw.toString();
    }


}

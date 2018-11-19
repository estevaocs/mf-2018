package br.ufg.inf.estevaocs;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public interface DtoInterface<T> {

    static <T> T fromJson() {
        return fromJson();
    }

    static <T> T fromXml() {
        return fromXml();
    }

    String toJson() throws IOException;

    String toXml() throws IOException, JAXBException;

    void toJson(String path) throws IOException;

    void toXml(String path) throws IOException, JAXBException;

    void toJson(Path path) throws IOException;

    void toXml(Path path) throws IOException, JAXBException;

    void toJson(File file) throws IOException;

    void toXml(File file) throws IOException, JAXBException;

}

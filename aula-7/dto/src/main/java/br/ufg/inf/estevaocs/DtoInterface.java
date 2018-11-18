package br.ufg.inf.estevaocs;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface DtoInterface<T> {

    static <T> T fromJson() {
        return fromJson();
    }

    static <T> T fromXml() {
        return fromXml();
    }

    String toJson() throws IOException;

    String toXml() throws IOException, JAXBException;


}

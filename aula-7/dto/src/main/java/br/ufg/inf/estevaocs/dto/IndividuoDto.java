package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class IndividuoDto extends GenericDto implements DtoInterface {

    @XmlElement
    private String individuo;

    public IndividuoDto() {
    }

    public IndividuoDto(String individuo) {
        this.individuo = individuo;
    }

    public static IndividuoDto fromJson(String json) {
        IndividuoDto obj = GenericDto.fromJson(json, IndividuoDto.class);
        return obj;
    }

    public static IndividuoDto fromJson(File json) throws FileNotFoundException {
        IndividuoDto obj = GenericDto.fromJson(json, IndividuoDto.class);
        return obj;
    }

    public static IndividuoDto fromJson(Path json) throws FileNotFoundException {
        IndividuoDto obj = GenericDto.fromJson(json.toFile(), IndividuoDto.class);
        return obj;
    }


    public static IndividuoDto fromXml(String xml) throws JAXBException {
        IndividuoDto obj = GenericDto.fromXml(xml, IndividuoDto.class);
        return obj;
    }

    public static IndividuoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        IndividuoDto obj = GenericDto.fromXml(xml, IndividuoDto.class);
        return obj;
    }

    public static IndividuoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        IndividuoDto obj = GenericDto.fromXml(xml.toFile(), IndividuoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}


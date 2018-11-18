package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class UsoCondicionalDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;

    public UsoCondicionalDto() {
    }

    public UsoCondicionalDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static UsoCondicionalDto fromJson(String json) {
        UsoCondicionalDto obj = GenericDto.fromJson(json, UsoCondicionalDto.class);
        return obj;
    }

    public static UsoCondicionalDto fromJson(File json) throws FileNotFoundException {
        UsoCondicionalDto obj = GenericDto.fromJson(json, UsoCondicionalDto.class);
        return obj;
    }

    public static UsoCondicionalDto fromJson(Path json) throws FileNotFoundException {
        UsoCondicionalDto obj = GenericDto.fromJson(json.toFile(), UsoCondicionalDto.class);
        return obj;
    }


    public static UsoCondicionalDto fromXml(String xml) throws JAXBException {
        UsoCondicionalDto obj = GenericDto.fromXml(xml, UsoCondicionalDto.class);
        return obj;
    }

    public static UsoCondicionalDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        UsoCondicionalDto obj = GenericDto.fromXml(xml, UsoCondicionalDto.class);
        return obj;
    }

    public static UsoCondicionalDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        UsoCondicionalDto obj = GenericDto.fromXml(xml.toFile(), UsoCondicionalDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

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
public class PaisDto extends GenericDto implements DtoInterface {

    @XmlElement
    private Integer codigo;

    @XmlElement
    private String nome;

    public PaisDto() {

    }

    public PaisDto(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public static PaisDto fromJson(String json) {
        PaisDto paisDto = GenericDto.fromJson(json, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromJson(File json) throws FileNotFoundException {
        PaisDto paisDto = GenericDto.fromJson(json, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromJson(Path json) throws FileNotFoundException {
        PaisDto paisDto = GenericDto.fromJson(json.toFile(), PaisDto.class);
        return paisDto;
    }


    public static PaisDto fromXml(String xml) throws JAXBException {
        PaisDto paisDto = GenericDto.fromXml(xml, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        PaisDto paisDto = GenericDto.fromXml(xml, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        PaisDto paisDto = GenericDto.fromXml(xml.toFile(), PaisDto.class);
        return paisDto;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }

}

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
public class NomeUsoDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String alternativo;
    @XmlElement
    private String descricao;

    public NomeUsoDto() {
    }

    public NomeUsoDto(Integer codigo, String alternativo, String descricao) {
        this.codigo = codigo;
        this.alternativo = alternativo;
        this.descricao = descricao;
    }

    public static NomeUsoDto fromJson(String json) {
        NomeUsoDto obj = GenericDto.fromJson(json, NomeUsoDto.class);
        return obj;
    }

    public static NomeUsoDto fromJson(File json) throws FileNotFoundException {
        NomeUsoDto obj = GenericDto.fromJson(json, NomeUsoDto.class);
        return obj;
    }

    public static NomeUsoDto fromJson(Path json) throws FileNotFoundException {
        NomeUsoDto obj = GenericDto.fromJson(json.toFile(), NomeUsoDto.class);
        return obj;
    }

    public static NomeUsoDto fromXml(String xml) throws JAXBException {
        NomeUsoDto obj = GenericDto.fromXml(xml, NomeUsoDto.class);
        return obj;
    }

    public static NomeUsoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NomeUsoDto obj = GenericDto.fromXml(xml, NomeUsoDto.class);
        return obj;
    }

    public static NomeUsoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NomeUsoDto obj = GenericDto.fromXml(xml.toFile(), NomeUsoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

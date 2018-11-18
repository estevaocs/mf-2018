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
public class ComunicacaoUsoDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;
    @XmlElement
    private String alternativo;

    public ComunicacaoUsoDto() {
    }

    public ComunicacaoUsoDto(Integer codigo, String descricao, String alternativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alternativo = alternativo;
    }

    public static ComunicacaoUsoDto fromJson(String json) {
        ComunicacaoUsoDto obj = GenericDto.fromJson(json, ComunicacaoUsoDto.class);
        return obj;
    }

    public static ComunicacaoUsoDto fromJson(File json) throws FileNotFoundException {
        ComunicacaoUsoDto obj = GenericDto.fromJson(json, ComunicacaoUsoDto.class);
        return obj;
    }

    public static ComunicacaoUsoDto fromJson(Path json) throws FileNotFoundException {
        ComunicacaoUsoDto obj = GenericDto.fromJson(json.toFile(), ComunicacaoUsoDto.class);
        return obj;
    }

    public static ComunicacaoUsoDto fromXml(String xml) throws JAXBException {
        ComunicacaoUsoDto obj = GenericDto.fromXml(xml, ComunicacaoUsoDto.class);
        return obj;
    }

    public static ComunicacaoUsoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        ComunicacaoUsoDto obj = GenericDto.fromXml(xml, ComunicacaoUsoDto.class);
        return obj;
    }

    public static ComunicacaoUsoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        ComunicacaoUsoDto obj = GenericDto.fromXml(xml.toFile(), ComunicacaoUsoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

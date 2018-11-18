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
public class CertidaoTipoDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;

    public CertidaoTipoDto() {
    }

    public CertidaoTipoDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static CertidaoTipoDto fromJson(String json) {
        CertidaoTipoDto obj = GenericDto.fromJson(json, CertidaoTipoDto.class);
        return obj;
    }

    public static CertidaoTipoDto fromJson(File json) throws FileNotFoundException {
        CertidaoTipoDto obj = GenericDto.fromJson(json, CertidaoTipoDto.class);
        return obj;
    }

    public static CertidaoTipoDto fromJson(Path json) throws FileNotFoundException {
        CertidaoTipoDto obj = GenericDto.fromJson(json.toFile(), CertidaoTipoDto.class);
        return obj;
    }

    public static CertidaoTipoDto fromXml(String xml) throws JAXBException {
        CertidaoTipoDto obj = GenericDto.fromXml(xml, CertidaoTipoDto.class);
        return obj;
    }

    public static CertidaoTipoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        CertidaoTipoDto obj = GenericDto.fromXml(xml, CertidaoTipoDto.class);
        return obj;
    }

    public static CertidaoTipoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        CertidaoTipoDto obj = GenericDto.fromXml(xml.toFile(), CertidaoTipoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

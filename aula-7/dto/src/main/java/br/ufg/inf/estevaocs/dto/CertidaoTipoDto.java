package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

@XmlRootElement
public class CertidaoTipoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

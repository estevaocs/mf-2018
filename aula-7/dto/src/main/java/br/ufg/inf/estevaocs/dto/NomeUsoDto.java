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
public class NomeUsoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private String alternativo;
    @XmlElement
    @Attributes
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

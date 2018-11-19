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
public class UsoCondicionalDto extends GenericDto {
    @XmlElement
    @Attributes
    private Integer codigo;
    @XmlElement
    @Attributes
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

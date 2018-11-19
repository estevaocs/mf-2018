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
public class ComunicacaoPreferenciaDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private String codigo;
    @XmlElement
    @Attributes
    private String descricao;

    public ComunicacaoPreferenciaDto() {
    }

    public ComunicacaoPreferenciaDto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static ComunicacaoPreferenciaDto fromJson(String json) {
        ComunicacaoPreferenciaDto obj = GenericDto.fromJson(json, ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public static ComunicacaoPreferenciaDto fromJson(File json) throws FileNotFoundException {
        ComunicacaoPreferenciaDto obj = GenericDto.fromJson(json, ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public static ComunicacaoPreferenciaDto fromJson(Path json) throws FileNotFoundException {
        ComunicacaoPreferenciaDto obj = GenericDto.fromJson(json.toFile(), ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public static ComunicacaoPreferenciaDto fromXml(String xml) throws JAXBException {
        ComunicacaoPreferenciaDto obj = GenericDto.fromXml(xml, ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public static ComunicacaoPreferenciaDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        ComunicacaoPreferenciaDto obj = GenericDto.fromXml(xml, ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public static ComunicacaoPreferenciaDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        ComunicacaoPreferenciaDto obj = GenericDto.fromXml(xml.toFile(), ComunicacaoPreferenciaDto.class);
        return obj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
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
public class NomePreferidoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private String descricao;

    public NomePreferidoDto() {
    }

    public NomePreferidoDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public static NomePreferidoDto fromJson(String json) {
        NomePreferidoDto obj = GenericDto.fromJson(json, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromJson(File json) throws FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromJson(json, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromJson(Path json) throws FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromJson(json.toFile(), NomePreferidoDto.class);
        return obj;
    }


    public static NomePreferidoDto fromXml(String xml) throws JAXBException {
        NomePreferidoDto obj = GenericDto.fromXml(xml, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromXml(xml, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromXml(xml.toFile(), NomePreferidoDto.class);
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

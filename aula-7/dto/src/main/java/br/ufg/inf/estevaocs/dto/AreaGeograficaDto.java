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
public class AreaGeograficaDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes(maxLength = 1)
    private String alternativo;
    @XmlElement
    @Attributes
    private String descricao;

    public AreaGeograficaDto() {
    }

    public AreaGeograficaDto(Integer codigo, String alternativo, String descricao) {
        this.codigo = codigo;
        this.alternativo = alternativo;
        this.descricao = descricao;
    }

    public static AreaGeograficaDto fromJson(String json) {
        AreaGeograficaDto obj = GenericDto.fromJson(json, AreaGeograficaDto.class);
        return obj;
    }

    public static AreaGeograficaDto fromJson(File json) throws FileNotFoundException {
        AreaGeograficaDto obj = GenericDto.fromJson(json, AreaGeograficaDto.class);
        return obj;
    }

    public static AreaGeograficaDto fromJson(Path json) throws FileNotFoundException {
        AreaGeograficaDto obj = GenericDto.fromJson(json.toFile(), AreaGeograficaDto.class);
        return obj;
    }

    public static AreaGeograficaDto fromXml(String xml) throws JAXBException {
        AreaGeograficaDto obj = GenericDto.fromXml(xml, AreaGeograficaDto.class);
        return obj;
    }

    public static AreaGeograficaDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        AreaGeograficaDto obj = GenericDto.fromXml(xml, AreaGeograficaDto.class);
        return obj;
    }

    public static AreaGeograficaDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        AreaGeograficaDto obj = GenericDto.fromXml(xml.toFile(), AreaGeograficaDto.class);
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

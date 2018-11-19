package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

@XmlRootElement
public class SituacaoFamiliarDto extends GenericDto implements DtoInterface {

    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private String descricao;

    public SituacaoFamiliarDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public SituacaoFamiliarDto() {
    }

    public static SituacaoFamiliarDto fromJson(String json) {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromJson(File json) throws FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromJson(Path json) throws FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json.toFile(), SituacaoFamiliarDto.class);
        return obj;
    }


    public static SituacaoFamiliarDto fromXml(String xml) throws JAXBException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml.toFile(), SituacaoFamiliarDto.class);
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

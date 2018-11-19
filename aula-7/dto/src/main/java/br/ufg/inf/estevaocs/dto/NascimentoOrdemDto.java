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
public class NascimentoOrdemDto extends GenericDto implements DtoInterface {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private  String descricao;

    public NascimentoOrdemDto() {
    }

    public NascimentoOrdemDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NascimentoOrdemDto fromJson(String json) {
        NascimentoOrdemDto obj = GenericDto.fromJson(json, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromJson(File json) throws FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromJson(json, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromJson(Path json) throws FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromJson(json.toFile(), NascimentoOrdemDto.class);
        return obj;
    }


    public static NascimentoOrdemDto fromXml(String xml) throws JAXBException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml.toFile(), NascimentoOrdemDto.class);
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

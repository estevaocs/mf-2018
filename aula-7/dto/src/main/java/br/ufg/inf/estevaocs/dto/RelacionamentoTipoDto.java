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
public class RelacionamentoTipoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private String descricao;

    public RelacionamentoTipoDto() {
    }

    public RelacionamentoTipoDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static RelacionamentoTipoDto fromJson(String json) {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromJson(File json) throws FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromJson(Path json) throws FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json.toFile(), RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(String xml) throws JAXBException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml.toFile(), RelacionamentoTipoDto.class);
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

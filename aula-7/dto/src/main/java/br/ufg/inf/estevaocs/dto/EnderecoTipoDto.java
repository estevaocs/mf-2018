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
public class EnderecoTipoDto extends GenericDto implements DtoInterface {
    @XmlElement
    @Attributes(required = true)
    private Integer codigo;
    @XmlElement
    @Attributes
    private String descricao;

    public EnderecoTipoDto() {
    }

    public EnderecoTipoDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static EnderecoTipoDto fromJson(String json) {
        EnderecoTipoDto obj = GenericDto.fromJson(json, EnderecoTipoDto.class);
        return obj;
    }

    public static EnderecoTipoDto fromJson(File json) throws FileNotFoundException {
        EnderecoTipoDto obj = GenericDto.fromJson(json, EnderecoTipoDto.class);
        return obj;
    }

    public static EnderecoTipoDto fromJson(Path json) throws FileNotFoundException {
        EnderecoTipoDto obj = GenericDto.fromJson(json.toFile(), EnderecoTipoDto.class);
        return obj;
    }


    public static EnderecoTipoDto fromXml(String xml) throws JAXBException {
        EnderecoTipoDto obj = GenericDto.fromXml(xml, EnderecoTipoDto.class);
        return obj;
    }

    public static EnderecoTipoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        EnderecoTipoDto obj = GenericDto.fromXml(xml, EnderecoTipoDto.class);
        return obj;
    }

    public static EnderecoTipoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        EnderecoTipoDto obj = GenericDto.fromXml(xml.toFile(), EnderecoTipoDto.class);
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

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
public class PaisDto extends GenericDto implements DtoInterface {

    @XmlElement
    @Attributes(required = true)
    private Integer codigo;

    @XmlElement
    @Attributes
    private String nome;

    public PaisDto() {

    }

    public PaisDto(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public static PaisDto fromJson(String json) {
        PaisDto paisDto = GenericDto.fromJson(json, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromJson(File json) throws FileNotFoundException {
        PaisDto paisDto = GenericDto.fromJson(json, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromJson(Path json) throws FileNotFoundException {
        PaisDto paisDto = GenericDto.fromJson(json.toFile(), PaisDto.class);
        return paisDto;
    }


    public static PaisDto fromXml(String xml) throws JAXBException {
        PaisDto paisDto = GenericDto.fromXml(xml, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        PaisDto paisDto = GenericDto.fromXml(xml, PaisDto.class);
        return paisDto;
    }

    public static PaisDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        PaisDto paisDto = GenericDto.fromXml(xml.toFile(), PaisDto.class);
        return paisDto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

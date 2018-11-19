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
public class EstadoDto extends GenericDto implements DtoInterface {
    @XmlElement
    @Attributes(required = true, maxLength = 2)
    private String codigo;
    @XmlElement
    @Attributes
    private String nome;

    public EstadoDto() {
    }

    public EstadoDto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public static EstadoDto fromJson(String json) {
        EstadoDto obj = GenericDto.fromJson(json, EstadoDto.class);
        return obj;
    }

    public static EstadoDto fromJson(File json) throws FileNotFoundException {
        EstadoDto obj = GenericDto.fromJson(json, EstadoDto.class);
        return obj;
    }

    public static EstadoDto fromJson(Path json) throws FileNotFoundException {
        EstadoDto obj = GenericDto.fromJson(json.toFile(), EstadoDto.class);
        return obj;
    }


    public static EstadoDto fromXml(String xml) throws JAXBException {
        EstadoDto obj = GenericDto.fromXml(xml, EstadoDto.class);
        return obj;
    }

    public static EstadoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        EstadoDto obj = GenericDto.fromXml(xml, EstadoDto.class);
        return obj;
    }

    public static EstadoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        EstadoDto obj = GenericDto.fromXml(xml.toFile(), EstadoDto.class);
        return obj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

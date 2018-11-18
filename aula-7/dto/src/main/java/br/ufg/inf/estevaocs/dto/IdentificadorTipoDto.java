package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class IdentificadorTipoDto extends GenericDto {
    @XmlElement
    private String codigo;
    @XmlElement
    private String descricao;

    public IdentificadorTipoDto() {
    }

    public IdentificadorTipoDto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public static IdentificadorTipoDto fromJson(String json) {
        IdentificadorTipoDto obj = GenericDto.fromJson(json, IdentificadorTipoDto.class);
        return obj;
    }

    public static IdentificadorTipoDto fromJson(File json) throws FileNotFoundException {
        IdentificadorTipoDto obj = GenericDto.fromJson(json, IdentificadorTipoDto.class);
        return obj;
    }

    public static IdentificadorTipoDto fromJson(Path json) throws FileNotFoundException {
        IdentificadorTipoDto obj = GenericDto.fromJson(json.toFile(), IdentificadorTipoDto.class);
        return obj;
    }

    public static IdentificadorTipoDto fromXml(String xml) throws JAXBException {
        IdentificadorTipoDto obj = GenericDto.fromXml(xml, IdentificadorTipoDto.class);
        return obj;
    }

    public static IdentificadorTipoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        IdentificadorTipoDto obj = GenericDto.fromXml(xml, IdentificadorTipoDto.class);
        return obj;
    }

    public static IdentificadorTipoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        IdentificadorTipoDto obj = GenericDto.fromXml(xml.toFile(), IdentificadorTipoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

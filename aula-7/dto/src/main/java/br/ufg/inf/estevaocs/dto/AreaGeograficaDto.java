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
public class AreaGeograficaDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String alternativo;
    @XmlElement
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

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

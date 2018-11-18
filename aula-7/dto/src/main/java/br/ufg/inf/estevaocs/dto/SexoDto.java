package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class SexoDto extends GenericDto implements DtoInterface {

    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;
    @XmlElement
    private String alternativo;

    public SexoDto(Integer codigo, String descricao, String alternativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alternativo = alternativo;
    }

    public SexoDto() {
    }

    public static SexoDto fromJson(String json) {
        SexoDto obj = GenericDto.fromJson(json, SexoDto.class);
        return obj;
    }

    public static SexoDto fromJson(File json) throws FileNotFoundException {
        SexoDto obj = GenericDto.fromJson(json, SexoDto.class);
        return obj;
    }

    public static SexoDto fromJson(Path json) throws FileNotFoundException {
        SexoDto obj = GenericDto.fromJson(json.toFile(), SexoDto.class);
        return obj;
    }


    public static SexoDto fromXml(String xml) throws JAXBException {
        SexoDto obj = GenericDto.fromXml(xml, SexoDto.class);
        return obj;
    }

    public static SexoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        SexoDto obj = GenericDto.fromXml(xml, SexoDto.class);
        return obj;
    }

    public static SexoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        SexoDto obj = GenericDto.fromXml(xml.toFile(), SexoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }

}

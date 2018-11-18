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
public class RacaDto extends GenericDto implements DtoInterface {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private  String descricao;

    public RacaDto() {
    }

    public RacaDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static RacaDto fromJson(String json) {
        RacaDto obj = GenericDto.fromJson(json, RacaDto.class);
        return obj;
    }

    public static RacaDto fromJson(File json) throws FileNotFoundException {
        RacaDto obj = GenericDto.fromJson(json, RacaDto.class);
        return obj;
    }

    public static RacaDto fromJson(Path json) throws FileNotFoundException {
        RacaDto obj = GenericDto.fromJson(json.toFile(), RacaDto.class);
        return obj;
    }


    public static RacaDto fromXml(String xml) throws JAXBException {
        RacaDto obj = GenericDto.fromXml(xml, RacaDto.class);
        return obj;
    }

    public static RacaDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        RacaDto obj = GenericDto.fromXml(xml, RacaDto.class);
        return obj;
    }

    public static RacaDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        RacaDto obj = GenericDto.fromXml(xml.toFile(), RacaDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}
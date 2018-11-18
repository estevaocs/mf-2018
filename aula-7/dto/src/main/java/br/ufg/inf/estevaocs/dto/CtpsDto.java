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
public class CtpsDto extends GenericDto {
    @XmlElement
    private IdentificadorDto identificador;
    @XmlElement
    private Integer serie;
    @XmlElement
    private EstadoDto estado;

    public CtpsDto() {
    }

    public CtpsDto(IdentificadorDto identificador, Integer serie, EstadoDto estado) {
        this.identificador = identificador;
        this.serie = serie;
        this.estado = estado;
    }
    public static CtpsDto fromJson(String json) {
        CtpsDto obj = GenericDto.fromJson(json, CtpsDto.class);
        return obj;
    }

    public static CtpsDto fromJson(File json) throws FileNotFoundException {
        CtpsDto obj = GenericDto.fromJson(json, CtpsDto.class);
        return obj;
    }

    public static CtpsDto fromJson(Path json) throws FileNotFoundException {
        CtpsDto obj = GenericDto.fromJson(json.toFile(), CtpsDto.class);
        return obj;
    }

    public static CtpsDto fromXml(String xml) throws JAXBException {
        CtpsDto obj = GenericDto.fromXml(xml, CtpsDto.class);
        return obj;
    }

    public static CtpsDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        CtpsDto obj = GenericDto.fromXml(xml, CtpsDto.class);
        return obj;
    }

    public static CtpsDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        CtpsDto obj = GenericDto.fromXml(xml.toFile(), CtpsDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

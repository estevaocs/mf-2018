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
public class ObitoFonteDto extends GenericDto implements DtoInterface {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private  String descricao;

    public ObitoFonteDto() {
    }

    public ObitoFonteDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static ObitoFonteDto fromJson(String json) {
        ObitoFonteDto obj = GenericDto.fromJson(json, ObitoFonteDto.class);
        return obj;
    }

    public static ObitoFonteDto fromJson(File json) throws FileNotFoundException {
        ObitoFonteDto obj = GenericDto.fromJson(json, ObitoFonteDto.class);
        return obj;
    }

    public static ObitoFonteDto fromJson(Path json) throws FileNotFoundException {
        ObitoFonteDto obj = GenericDto.fromJson(json.toFile(), ObitoFonteDto.class);
        return obj;
    }


    public static ObitoFonteDto fromXml(String xml) throws JAXBException {
        ObitoFonteDto obj = GenericDto.fromXml(xml, ObitoFonteDto.class);
        return obj;
    }

    public static ObitoFonteDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        ObitoFonteDto obj = GenericDto.fromXml(xml, ObitoFonteDto.class);
        return obj;
    }

    public static ObitoFonteDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        ObitoFonteDto obj = GenericDto.fromXml(xml.toFile(), ObitoFonteDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

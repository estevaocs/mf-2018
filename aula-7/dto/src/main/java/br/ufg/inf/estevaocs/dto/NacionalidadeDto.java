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
public class NacionalidadeDto extends GenericDto implements DtoInterface {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private  String descricao;

    public NacionalidadeDto() {
    }

    public NacionalidadeDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NacionalidadeDto fromJson(String json) {
        NacionalidadeDto obj = GenericDto.fromJson(json, NacionalidadeDto.class);
        return obj;
    }

    public static NacionalidadeDto fromJson(File json) throws FileNotFoundException {
        NacionalidadeDto obj = GenericDto.fromJson(json, NacionalidadeDto.class);
        return obj;
    }

    public static NacionalidadeDto fromJson(Path json) throws FileNotFoundException {
        NacionalidadeDto obj = GenericDto.fromJson(json.toFile(), NacionalidadeDto.class);
        return obj;
    }


    public static NacionalidadeDto fromXml(String xml) throws JAXBException {
        NacionalidadeDto obj = GenericDto.fromXml(xml, NacionalidadeDto.class);
        return obj;
    }

    public static NacionalidadeDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NacionalidadeDto obj = GenericDto.fromXml(xml, NacionalidadeDto.class);
        return obj;
    }

    public static NacionalidadeDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NacionalidadeDto obj = GenericDto.fromXml(xml.toFile(), NacionalidadeDto.class);
        return obj;
    }
    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}
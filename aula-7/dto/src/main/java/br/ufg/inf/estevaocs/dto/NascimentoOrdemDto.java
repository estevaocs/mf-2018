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
public class NascimentoOrdemDto extends GenericDto implements DtoInterface {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private  String descricao;

    public NascimentoOrdemDto() {
    }

    public NascimentoOrdemDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NascimentoOrdemDto fromJson(String json) {
        NascimentoOrdemDto obj = GenericDto.fromJson(json, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromJson(File json) throws FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromJson(json, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromJson(Path json) throws FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromJson(json.toFile(), NascimentoOrdemDto.class);
        return obj;
    }


    public static NascimentoOrdemDto fromXml(String xml) throws JAXBException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml, NascimentoOrdemDto.class);
        return obj;
    }

    public static NascimentoOrdemDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NascimentoOrdemDto obj = GenericDto.fromXml(xml.toFile(), NascimentoOrdemDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }

}

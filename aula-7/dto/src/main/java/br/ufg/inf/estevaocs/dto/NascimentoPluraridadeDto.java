package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NascimentoPluraridadeDto extends GenericDto implements DtoInterface {

    @XmlElement
    private Integer codigo;

    @XmlElement
    private String  descricao;

    public NascimentoPluraridadeDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public NascimentoPluraridadeDto() {
    }

    public static NascimentoPluraridadeDto fromJson(String json) {
        NascimentoPluraridadeDto obj = GenericDto.fromJson(json, NascimentoPluraridadeDto.class);
        return obj;
    }

    public static NascimentoPluraridadeDto fromJson(File json) throws FileNotFoundException {
        NascimentoPluraridadeDto obj = GenericDto.fromJson(json, NascimentoPluraridadeDto.class);
        return obj;
    }

    public static NascimentoPluraridadeDto fromJson(Path json) throws FileNotFoundException {
        NascimentoPluraridadeDto obj = GenericDto.fromJson(json.toFile(), NascimentoPluraridadeDto.class);
        return obj;
    }


    public static NascimentoPluraridadeDto fromXml(String xml) throws JAXBException {
        NascimentoPluraridadeDto obj = GenericDto.fromXml(xml, NascimentoPluraridadeDto.class);
        return obj;
    }

    public static NascimentoPluraridadeDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NascimentoPluraridadeDto obj = GenericDto.fromXml(xml, NascimentoPluraridadeDto.class);
        return obj;
    }

    public static NascimentoPluraridadeDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NascimentoPluraridadeDto obj = GenericDto.fromXml(xml.toFile(), NascimentoPluraridadeDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }


}

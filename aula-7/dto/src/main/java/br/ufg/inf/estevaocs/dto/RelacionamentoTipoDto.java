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
public class RelacionamentoTipoDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;

    public RelacionamentoTipoDto() {
    }

    public RelacionamentoTipoDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static RelacionamentoTipoDto fromJson(String json) {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromJson(File json) throws FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromJson(Path json) throws FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromJson(json.toFile(), RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(String xml) throws JAXBException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml, RelacionamentoTipoDto.class);
        return obj;
    }

    public static RelacionamentoTipoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        RelacionamentoTipoDto obj = GenericDto.fromXml(xml.toFile(), RelacionamentoTipoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

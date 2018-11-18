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
public class SituacaoFamiliarDto extends GenericDto implements DtoInterface {

    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;

    public SituacaoFamiliarDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public SituacaoFamiliarDto() {
    }

    public static SituacaoFamiliarDto fromJson(String json) {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromJson(File json) throws FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromJson(Path json) throws FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromJson(json.toFile(), SituacaoFamiliarDto.class);
        return obj;
    }


    public static SituacaoFamiliarDto fromXml(String xml) throws JAXBException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml, SituacaoFamiliarDto.class);
        return obj;
    }

    public static SituacaoFamiliarDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        SituacaoFamiliarDto obj = GenericDto.fromXml(xml.toFile(), SituacaoFamiliarDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }

}

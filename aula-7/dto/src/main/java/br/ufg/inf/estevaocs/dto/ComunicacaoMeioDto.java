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
public class ComunicacaoMeioDto extends GenericDto {
    @XmlElement
    private Integer codigo;
    @XmlElement
    private String descricao;
    @XmlElement
    private String alternativo;

    public ComunicacaoMeioDto() {
    }

    public ComunicacaoMeioDto(Integer codigo, String descricao, String alternativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alternativo = alternativo;
    }

    public static ComunicacaoMeioDto fromJson(String json) {
        ComunicacaoMeioDto obj = GenericDto.fromJson(json, ComunicacaoMeioDto.class);
        return obj;
    }

    public static ComunicacaoMeioDto fromJson(File json) throws FileNotFoundException {
        ComunicacaoMeioDto obj = GenericDto.fromJson(json, ComunicacaoMeioDto.class);
        return obj;
    }

    public static ComunicacaoMeioDto fromJson(Path json) throws FileNotFoundException {
        ComunicacaoMeioDto obj = GenericDto.fromJson(json.toFile(), ComunicacaoMeioDto.class);
        return obj;
    }

    public static ComunicacaoMeioDto fromXml(String xml) throws JAXBException {
        ComunicacaoMeioDto obj = GenericDto.fromXml(xml, ComunicacaoMeioDto.class);
        return obj;
    }

    public static ComunicacaoMeioDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        ComunicacaoMeioDto obj = GenericDto.fromXml(xml, ComunicacaoMeioDto.class);
        return obj;
    }

    public static ComunicacaoMeioDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        ComunicacaoMeioDto obj = GenericDto.fromXml(xml.toFile(), ComunicacaoMeioDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

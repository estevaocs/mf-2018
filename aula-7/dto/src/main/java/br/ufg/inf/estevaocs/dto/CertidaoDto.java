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
public class CertidaoDto extends GenericDto {
    @XmlElement
    private IdentificadorDto identificador;
    @XmlElement
    private CertidaoTipoDto tipo;
    @XmlElement
    private String cartorio;
    @XmlElement
    private Integer livro;
    @XmlElement
    private Integer folha;
    @XmlElement
    private Integer termo;

    public CertidaoDto() {
    }

    public CertidaoDto(IdentificadorDto identificador, CertidaoTipoDto tipo, String cartorio, Integer livro,
                       Integer folha, Integer termo) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.cartorio = cartorio;
        this.livro = livro;
        this.folha = folha;
        this.termo = termo;
    }

    public static CertidaoDto fromJson(String json) {
        CertidaoDto obj = GenericDto.fromJson(json, CertidaoDto.class);
        return obj;
    }

    public static CertidaoDto fromJson(File json) throws FileNotFoundException {
        CertidaoDto obj = GenericDto.fromJson(json, CertidaoDto.class);
        return obj;
    }

    public static CertidaoDto fromJson(Path json) throws FileNotFoundException {
        CertidaoDto obj = GenericDto.fromJson(json.toFile(), CertidaoDto.class);
        return obj;
    }

    public static CertidaoDto fromXml(String xml) throws JAXBException {
        CertidaoDto obj = GenericDto.fromXml(xml, CertidaoDto.class);
        return obj;
    }

    public static CertidaoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        CertidaoDto obj = GenericDto.fromXml(xml, CertidaoDto.class);
        return obj;
    }

    public static CertidaoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        CertidaoDto obj = GenericDto.fromXml(xml.toFile(), CertidaoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

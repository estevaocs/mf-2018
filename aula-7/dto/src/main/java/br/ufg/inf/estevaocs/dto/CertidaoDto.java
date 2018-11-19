package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

@XmlRootElement
public class CertidaoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private IdentificadorDto identificador;
    @XmlElement
    @Attributes
    private CertidaoTipoDto tipo;
    @XmlElement
    @Attributes
    private String cartorio;
    @XmlElement
    @Attributes
    private Integer livro;
    @XmlElement
    @Attributes
    private Integer folha;
    @XmlElement
    @Attributes
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

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public CertidaoTipoDto getTipo() {
        return tipo;
    }

    public void setTipo(CertidaoTipoDto tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Integer getTermo() {
        return termo;
    }

    public void setTermo(Integer termo) {
        this.termo = termo;
    }
}

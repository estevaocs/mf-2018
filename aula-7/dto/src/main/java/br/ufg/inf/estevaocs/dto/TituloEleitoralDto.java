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
public class TituloEleitoralDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private IdentificadorDto identificador;
    @XmlElement
    @Attributes
    private Integer zona;
    @XmlElement
    @Attributes
    private Integer sessao;

    public TituloEleitoralDto() {
    }

    public TituloEleitoralDto(IdentificadorDto identificador, Integer zona, Integer sessao) {
        this.identificador = identificador;
        this.zona = zona;
        this.sessao = sessao;
    }

    public static TituloEleitoralDto fromJson(String json) {
        TituloEleitoralDto obj = GenericDto.fromJson(json, TituloEleitoralDto.class);
        return obj;
    }

    public static TituloEleitoralDto fromJson(File json) throws FileNotFoundException {
        TituloEleitoralDto obj = GenericDto.fromJson(json, TituloEleitoralDto.class);
        return obj;
    }

    public static TituloEleitoralDto fromJson(Path json) throws FileNotFoundException {
        TituloEleitoralDto obj = GenericDto.fromJson(json.toFile(), TituloEleitoralDto.class);
        return obj;
    }

    public static TituloEleitoralDto fromXml(String xml) throws JAXBException {
        TituloEleitoralDto obj = GenericDto.fromXml(xml, TituloEleitoralDto.class);
        return obj;
    }

    public static TituloEleitoralDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        TituloEleitoralDto obj = GenericDto.fromXml(xml, TituloEleitoralDto.class);
        return obj;
    }

    public static TituloEleitoralDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        TituloEleitoralDto obj = GenericDto.fromXml(xml.toFile(), TituloEleitoralDto.class);
        return obj;
    }


    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getSessao() {
        return sessao;
    }

    public void setSessao(Integer sessao) {
        this.sessao = sessao;
    }
}

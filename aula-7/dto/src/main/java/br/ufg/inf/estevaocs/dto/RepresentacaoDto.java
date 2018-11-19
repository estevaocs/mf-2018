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
public class RepresentacaoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private NomeDto nome;
    @XmlElement
    @Attributes
    private String utilizacao;
    @XmlElement
    @Attributes
    private String alternativa;

    public RepresentacaoDto() {
    }

    public RepresentacaoDto(NomeDto nome, String utilizacao, String alternativa) {
        this.nome = nome;
        this.utilizacao = utilizacao;
        this.alternativa = alternativa;
    }

    public static NomePreferidoDto fromJson(String json) {
        NomePreferidoDto obj = GenericDto.fromJson(json, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromJson(File json) throws FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromJson(json, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromJson(Path json) throws FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromJson(json.toFile(), NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromXml(String xml) throws JAXBException {
        NomePreferidoDto obj = GenericDto.fromXml(xml, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromXml(xml, NomePreferidoDto.class);
        return obj;
    }

    public static NomePreferidoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NomePreferidoDto obj = GenericDto.fromXml(xml.toFile(), NomePreferidoDto.class);
        return obj;
    }

    public NomeDto getNome() {
        return nome;
    }

    public void setNome(NomeDto nome) {
        this.nome = nome;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}

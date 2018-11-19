package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Calendar;

@XmlRootElement
public class UtilizacaoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private NomeDto nome;
    @XmlElement
    @Attributes
    private NomeUsoDto uso;
    @XmlElement
    @Attributes(required = true)
    private IdentificadorDto identificador;
    @XmlElement
    @Attributes
    private Calendar dataInicial;
    @XmlElement
    @Attributes
    private Calendar dataFinal;

    public UtilizacaoDto() {
    }

    public UtilizacaoDto(NomeDto nome, NomeUsoDto uso, IdentificadorDto identificador, Calendar dataInicial, Calendar dataFinal) {
        this.nome = nome;
        this.uso = uso;
        this.identificador = identificador;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public static UtilizacaoDto fromJson(String json) {
        UtilizacaoDto obj = GenericDto.fromJson(json, UtilizacaoDto.class);
        return obj;
    }

    public static UtilizacaoDto fromJson(File json) throws FileNotFoundException {
        UtilizacaoDto obj = GenericDto.fromJson(json, UtilizacaoDto.class);
        return obj;
    }

    public static UtilizacaoDto fromJson(Path json) throws FileNotFoundException {
        UtilizacaoDto obj = GenericDto.fromJson(json.toFile(), UtilizacaoDto.class);
        return obj;
    }

    public static UtilizacaoDto fromXml(String xml) throws JAXBException {
        UtilizacaoDto obj = GenericDto.fromXml(xml, UtilizacaoDto.class);
        return obj;
    }

    public static UtilizacaoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        UtilizacaoDto obj = GenericDto.fromXml(xml, UtilizacaoDto.class);
        return obj;
    }

    public static UtilizacaoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        UtilizacaoDto obj = GenericDto.fromXml(xml.toFile(), UtilizacaoDto.class);
        return obj;
    }

    public NomeDto getNome() {
        return nome;
    }

    public void setNome(NomeDto nome) {
        this.nome = nome;
    }

    public NomeUsoDto getUso() {
        return uso;
    }

    public void setUso(NomeUsoDto uso) {
        this.uso = uso;
    }

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
}

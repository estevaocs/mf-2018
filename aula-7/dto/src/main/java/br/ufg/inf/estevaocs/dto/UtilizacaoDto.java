package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Calendar;

@XmlRootElement
public class UtilizacaoDto extends GenericDto {
    @XmlElement
    private NomeDto nome;
    @XmlElement
    private NomeUsoDto uso;
    @XmlElement
    private IdentificadorDto identificador;
    @XmlElement
    private Calendar dataInicial;
    @XmlElement
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

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

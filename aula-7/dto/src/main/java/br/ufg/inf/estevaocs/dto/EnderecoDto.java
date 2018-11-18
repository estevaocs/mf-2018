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
import java.util.Calendar;

@XmlRootElement
public class EnderecoDto extends GenericDto {
    @XmlElement
    private String id;
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private String bairro;
    @XmlElement
    private String distrito;
    @XmlElement
    private MunicipioDto municipio;
    @XmlElement
    private EstadoDto estado;
    @XmlElement
    private String cep;
    @XmlElement
    private String caixaPostal;
    @XmlElement
    private PaisDto pais;
    @XmlElement
    private EnderecoTipoDto tipo;
    @XmlElement
    private Calendar dataInicial;
    @XmlElement
    private String dataInicialAcuracia;
    @XmlElement
    private Calendar dataFinal;
    @XmlElement
    private String dataFinalAcuracia;

    public EnderecoDto() {
    }

    public EnderecoDto(String id, IndividuoDto individuo, String bairro, String distrito, MunicipioDto municipio,
                       EstadoDto estado, String cep, String caixaPostal, PaisDto pais, EnderecoTipoDto tipo,
                       Calendar dataInicial, String dataInicialAcuracia, Calendar dataFinal, String dataFinalAcuracia) {
        this.id = id;
        this.individuo = individuo;
        this.bairro = bairro;
        this.distrito = distrito;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.caixaPostal = caixaPostal;
        this.pais = pais;
        this.tipo = tipo;
        this.dataInicial = dataInicial;
        this.dataInicialAcuracia = dataInicialAcuracia;
        this.dataFinal = dataFinal;
        this.dataFinalAcuracia = dataFinalAcuracia;
    }

    public static EnderecoDto fromJson(String json) {
        EnderecoDto obj = GenericDto.fromJson(json, EnderecoDto.class);
        return obj;
    }

    public static EnderecoDto fromJson(File json) throws FileNotFoundException {
        EnderecoDto obj = GenericDto.fromJson(json, EnderecoDto.class);
        return obj;
    }

    public static EnderecoDto fromJson(Path json) throws FileNotFoundException {
        EnderecoDto obj = GenericDto.fromJson(json.toFile(), EnderecoDto.class);
        return obj;
    }


    public static EnderecoDto fromXml(String xml) throws JAXBException {
        EnderecoDto obj = GenericDto.fromXml(xml, EnderecoDto.class);
        return obj;
    }

    public static EnderecoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        EnderecoDto obj = GenericDto.fromXml(xml, EnderecoDto.class);
        return obj;
    }

    public static EnderecoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        EnderecoDto obj = GenericDto.fromXml(xml.toFile(), EnderecoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
    
}

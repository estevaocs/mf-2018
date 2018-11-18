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
public class DadoDemograficoDto extends GenericDto {
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private Calendar nascimento;
    @XmlElement
    private String nascimentoAcuracia;
    @XmlElement
    private DataSeguimentoDto nascimentoSeguimento;
    @XmlElement
    private NascimentoPluraridadeDto nascimentoPluraridade;
    @XmlElement
    private NascimentoOrdemDto nascimentoOrdem;
    @XmlElement
    private Calendar obito;
    @XmlElement
    private String obitoAcuracia;
    @XmlElement
    private ObitoFonteDto obitoFonte;
    @XmlElement
    private SexoDto sexo;
    @XmlElement
    private String mae;
    @XmlElement
    private String pai;
    @XmlElement
    private SituacaoFamiliarDto situacaoFamiliar;
    @XmlElement
    private RacaDto raca;
    @XmlElement
    private String comentario;
    @XmlElement
    private NacionalidadeDto nacionalidade;
    @XmlElement
    private MunicipioDto municipio;
    @XmlElement
    private EstadoDto estado;
    @XmlElement
    private PaisDto pais;
    @XmlElement
    private Calendar dataEntradaPais;

    public DadoDemograficoDto() {
    }

    public DadoDemograficoDto(IndividuoDto individuo, Calendar nascimento, String nascimentoAcuracia,
                              DataSeguimentoDto nascimentoSeguimento, NascimentoPluraridadeDto nascimentoPluraridade,
                              NascimentoOrdemDto nascimentoOrdem, Calendar obito, String obitoAcuracia,
                              ObitoFonteDto obitoFonte, SexoDto sexo, String mae, String pai,
                              SituacaoFamiliarDto situacaoFamiliar, RacaDto raca, String comentario,
                              NacionalidadeDto nacionalidade, MunicipioDto municipio, EstadoDto estado,
                              PaisDto pais, Calendar dataEntradaPais) {
        this.individuo = individuo;
        this.nascimento = nascimento;
        this.nascimentoAcuracia = nascimentoAcuracia;
        this.nascimentoSeguimento = nascimentoSeguimento;
        this.nascimentoPluraridade = nascimentoPluraridade;
        this.nascimentoOrdem = nascimentoOrdem;
        this.obito = obito;
        this.obitoAcuracia = obitoAcuracia;
        this.obitoFonte = obitoFonte;
        this.sexo = sexo;
        this.mae = mae;
        this.pai = pai;
        this.situacaoFamiliar = situacaoFamiliar;
        this.raca = raca;
        this.comentario = comentario;
        this.nacionalidade = nacionalidade;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
        this.dataEntradaPais = dataEntradaPais;
    }

    public static DadoDemograficoDto fromJson(String json) {
        DadoDemograficoDto obj = GenericDto.fromJson(json, DadoDemograficoDto.class);
        return obj;
    }

    public static DadoDemograficoDto fromJson(File json) throws FileNotFoundException {
        DadoDemograficoDto obj = GenericDto.fromJson(json, DadoDemograficoDto.class);
        return obj;
    }

    public static DadoDemograficoDto fromJson(Path json) throws FileNotFoundException {
        DadoDemograficoDto obj = GenericDto.fromJson(json.toFile(), DadoDemograficoDto.class);
        return obj;
    }


    public static DadoDemograficoDto fromXml(String xml) throws JAXBException {
        DadoDemograficoDto obj = GenericDto.fromXml(xml, DadoDemograficoDto.class);
        return obj;
    }

    public static DadoDemograficoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        DadoDemograficoDto obj = GenericDto.fromXml(xml, DadoDemograficoDto.class);
        return obj;
    }

    public static DadoDemograficoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        DadoDemograficoDto obj = GenericDto.fromXml(xml.toFile(), DadoDemograficoDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

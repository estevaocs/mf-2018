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
public class DadoDemograficoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes
    private Calendar nascimento;
    @XmlElement
    @Attributes(maxLength = 3)
    private String nascimentoAcuracia;
    @XmlElement
    @Attributes
    private DataSeguimentoDto nascimentoSeguimento;
    @XmlElement
    @Attributes
    private NascimentoPluraridadeDto nascimentoPluraridade;
    @XmlElement
    @Attributes
    private NascimentoOrdemDto nascimentoOrdem;
    @XmlElement
    @Attributes
    private Calendar obito;
    @XmlElement
    @Attributes(maxLength = 3)
    private String obitoAcuracia;
    @XmlElement
    @Attributes
    private ObitoFonteDto obitoFonte;
    @XmlElement
    @Attributes(required = true)
    private SexoDto sexo;
    @XmlElement
    @Attributes
    private String mae;
    @XmlElement
    @Attributes
    private String pai;
    @XmlElement
    @Attributes
    private SituacaoFamiliarDto situacaoFamiliar;
    @XmlElement
    @Attributes
    private RacaDto raca;
    @XmlElement
    @Attributes
    private String comentario;
    @XmlElement
    @Attributes
    private NacionalidadeDto nacionalidade;
    @XmlElement
    @Attributes
    private MunicipioDto municipio;
    @XmlElement
    @Attributes
    private EstadoDto estado;
    @XmlElement
    @Attributes
    private PaisDto pais;
    @XmlElement
    @Attributes
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

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    public void setNascimentoAcuracia(String nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    public DataSeguimentoDto getNascimentoSeguimento() {
        return nascimentoSeguimento;
    }

    public void setNascimentoSeguimento(DataSeguimentoDto nascimentoSeguimento) {
        this.nascimentoSeguimento = nascimentoSeguimento;
    }

    public NascimentoPluraridadeDto getNascimentoPluraridade() {
        return nascimentoPluraridade;
    }

    public void setNascimentoPluraridade(NascimentoPluraridadeDto nascimentoPluraridade) {
        this.nascimentoPluraridade = nascimentoPluraridade;
    }

    public NascimentoOrdemDto getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(NascimentoOrdemDto nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public Calendar getObito() {
        return obito;
    }

    public void setObito(Calendar obito) {
        this.obito = obito;
    }

    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    public ObitoFonteDto getObitoFonte() {
        return obitoFonte;
    }

    public void setObitoFonte(ObitoFonteDto obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    public SexoDto getSexo() {
        return sexo;
    }

    public void setSexo(SexoDto sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public SituacaoFamiliarDto getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(SituacaoFamiliarDto situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public RacaDto getRaca() {
        return raca;
    }

    public void setRaca(RacaDto raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public NacionalidadeDto getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeDto nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public MunicipioDto getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDto municipio) {
        this.municipio = municipio;
    }

    public EstadoDto getEstado() {
        return estado;
    }

    public void setEstado(EstadoDto estado) {
        this.estado = estado;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }

    public Calendar getDataEntradaPais() {
        return dataEntradaPais;
    }

    public void setDataEntradaPais(Calendar dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }
}

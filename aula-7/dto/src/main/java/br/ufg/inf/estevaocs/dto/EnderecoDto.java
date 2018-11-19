package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

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
    @Attributes(required = true, maxLength = 36)
    private String id;
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes
    private String bairro;
    @XmlElement
    @Attributes
    private String distrito;
    @XmlElement
    @Attributes
    private MunicipioDto municipio;
    @XmlElement
    @Attributes
    private EstadoDto estado;
    @XmlElement
    @Attributes
    private String cep;
    @XmlElement
    @Attributes
    private String caixaPostal;
    @XmlElement
    @Attributes
    private PaisDto pais;
    @XmlElement
    @Attributes
    private EnderecoTipoDto tipo;
    @XmlElement
    @Attributes
    private Calendar dataInicial;
    @XmlElement
    @Attributes(maxLength = 3)
    private String dataInicialAcuracia;
    @XmlElement
    @Attributes
    private Calendar dataFinal;
    @XmlElement
    @Attributes(maxLength = 3)
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }

    public EnderecoTipoDto getTipo() {
        return tipo;
    }

    public void setTipo(EnderecoTipoDto tipo) {
        this.tipo = tipo;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataInicialAcuracia() {
        return dataInicialAcuracia;
    }

    public void setDataInicialAcuracia(String dataInicialAcuracia) {
        this.dataInicialAcuracia = dataInicialAcuracia;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataFinalAcuracia() {
        return dataFinalAcuracia;
    }

    public void setDataFinalAcuracia(String dataFinalAcuracia) {
        this.dataFinalAcuracia = dataFinalAcuracia;
    }
}

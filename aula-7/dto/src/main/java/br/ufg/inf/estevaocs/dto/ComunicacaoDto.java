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
public class ComunicacaoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes(required = true)
    private ComunicacaoMeioDto comunicacaoMeio;
    @XmlElement
    @Attributes
    private ComunicacaoPreferenciaDto comunicacaoPreferencia;
    @XmlElement
    @Attributes(required = true)
    private String detalhe;
    @XmlElement
    @Attributes
    private ComunicacaoUsoDto comunicacaoUso;

    public ComunicacaoDto() {
    }

    public ComunicacaoDto(IndividuoDto individuo, ComunicacaoMeioDto comunicacaoMeio,
                          ComunicacaoPreferenciaDto comunicacaoPreferencia, String detalhe,
                          ComunicacaoUsoDto comunicacaoUso) {
        this.individuo = individuo;
        this.comunicacaoMeio = comunicacaoMeio;
        this.comunicacaoPreferencia = comunicacaoPreferencia;
        this.detalhe = detalhe;
        this.comunicacaoUso = comunicacaoUso;
    }

    public static ComunicacaoDto fromJson(String json) {
        ComunicacaoDto obj = GenericDto.fromJson(json, ComunicacaoDto.class);
        return obj;
    }

    public static ComunicacaoDto fromJson(File json) throws FileNotFoundException {
        ComunicacaoDto obj = GenericDto.fromJson(json, ComunicacaoDto.class);
        return obj;
    }

    public static ComunicacaoDto fromJson(Path json) throws FileNotFoundException {
        ComunicacaoDto obj = GenericDto.fromJson(json.toFile(), ComunicacaoDto.class);
        return obj;
    }

    public static ComunicacaoDto fromXml(String xml) throws JAXBException {
        ComunicacaoDto obj = GenericDto.fromXml(xml, ComunicacaoDto.class);
        return obj;
    }

    public static ComunicacaoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        ComunicacaoDto obj = GenericDto.fromXml(xml, ComunicacaoDto.class);
        return obj;
    }

    public static ComunicacaoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        ComunicacaoDto obj = GenericDto.fromXml(xml.toFile(), ComunicacaoDto.class);
        return obj;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public ComunicacaoMeioDto getComunicacaoMeio() {
        return comunicacaoMeio;
    }

    public void setComunicacaoMeio(ComunicacaoMeioDto comunicacaoMeio) {
        this.comunicacaoMeio = comunicacaoMeio;
    }

    public ComunicacaoPreferenciaDto getComunicacaoPreferencia() {
        return comunicacaoPreferencia;
    }

    public void setComunicacaoPreferencia(ComunicacaoPreferenciaDto comunicacaoPreferencia) {
        this.comunicacaoPreferencia = comunicacaoPreferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public ComunicacaoUsoDto getComunicacaoUso() {
        return comunicacaoUso;
    }

    public void setComunicacaoUso(ComunicacaoUsoDto comunicacaoUso) {
        this.comunicacaoUso = comunicacaoUso;
    }
}

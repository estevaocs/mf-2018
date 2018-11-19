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
public class VinculoDto extends GenericDto {
    @XmlElement
    @Attributes(required = true)
    private IdentificadorDto identificador;
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes
    private RelacionamentoTipoDto relacionamento;
    @XmlElement
    @Attributes
    private Calendar dataInicio;
    @XmlElement
    @Attributes
    private Calendar dataFinal;

    public VinculoDto() {
    }

    public VinculoDto(IdentificadorDto identificador, IndividuoDto individuo, RelacionamentoTipoDto relacionamento, 
                      Calendar dataInicio, Calendar dataFinal) {
        this.identificador = identificador;
        this.individuo = individuo;
        this.relacionamento = relacionamento;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public static VinculoDto fromJson(String json) {
        VinculoDto obj = GenericDto.fromJson(json, VinculoDto.class);
        return obj;
    }

    public static VinculoDto fromJson(File json) throws FileNotFoundException {
        VinculoDto obj = GenericDto.fromJson(json, VinculoDto.class);
        return obj;
    }

    public static VinculoDto fromJson(Path json) throws FileNotFoundException {
        VinculoDto obj = GenericDto.fromJson(json.toFile(), VinculoDto.class);
        return obj;
    }

    public static VinculoDto fromXml(String xml) throws JAXBException {
        VinculoDto obj = GenericDto.fromXml(xml, VinculoDto.class);
        return obj;
    }

    public static VinculoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        VinculoDto obj = GenericDto.fromXml(xml, VinculoDto.class);
        return obj;
    }

    public static VinculoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        VinculoDto obj = GenericDto.fromXml(xml.toFile(), VinculoDto.class);
        return obj;
    }

    public IdentificadorDto getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDto identificador) {
        this.identificador = identificador;
    }

    public IndividuoDto getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDto individuo) {
        this.individuo = individuo;
    }

    public RelacionamentoTipoDto getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(RelacionamentoTipoDto relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
}

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
public class VinculoDto extends GenericDto {
    @XmlElement
    private IdentificadorDto identificador;
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private RelacionamentoTipoDto relacionamento;
    @XmlElement
    private Calendar dataInicio;
    @XmlElement
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

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
    
}

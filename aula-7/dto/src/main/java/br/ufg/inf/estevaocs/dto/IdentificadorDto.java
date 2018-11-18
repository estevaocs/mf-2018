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
public class IdentificadorDto extends GenericDto {
    @XmlElement
    private String id;
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private String designação;
    @XmlElement
    private AreaGeograficaDto area;
    @XmlElement
    private String emissor;
    @XmlElement
    private Calendar data;
    @XmlElement
    private IdentificadorTipoDto tipo;

    public IdentificadorDto() {
    }

    public IdentificadorDto(String id, IndividuoDto individuo, String designação, AreaGeograficaDto area, 
                            String emissor, Calendar data, IdentificadorTipoDto tipo) {
        this.id = id;
        this.individuo = individuo;
        this.designação = designação;
        this.area = area;
        this.emissor = emissor;
        this.data = data;
        this.tipo = tipo;
    }

    public static IdentificadorDto fromJson(String json) {
        IdentificadorDto obj = GenericDto.fromJson(json, IdentificadorDto.class);
        return obj;
    }

    public static IdentificadorDto fromJson(File json) throws FileNotFoundException {
        IdentificadorDto obj = GenericDto.fromJson(json, IdentificadorDto.class);
        return obj;
    }

    public static IdentificadorDto fromJson(Path json) throws FileNotFoundException {
        IdentificadorDto obj = GenericDto.fromJson(json.toFile(), IdentificadorDto.class);
        return obj;
    }

    public static IdentificadorDto fromXml(String xml) throws JAXBException {
        IdentificadorDto obj = GenericDto.fromXml(xml, IdentificadorDto.class);
        return obj;
    }

    public static IdentificadorDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        IdentificadorDto obj = GenericDto.fromXml(xml, IdentificadorDto.class);
        return obj;
    }

    public static IdentificadorDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        IdentificadorDto obj = GenericDto.fromXml(xml.toFile(), IdentificadorDto.class);
        return obj;
    }

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
    
}

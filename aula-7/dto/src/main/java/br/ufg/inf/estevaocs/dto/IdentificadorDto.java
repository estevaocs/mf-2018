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
public class IdentificadorDto extends GenericDto {
    @XmlElement
    @Attributes(required = true, maxLength = 36)
    private String id;
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes(required = true)
    private String designacao;
    @XmlElement
    @Attributes(required = true)
    private AreaGeograficaDto area;
    @XmlElement
    @Attributes(required = true)
    private String emissor;
    @XmlElement
    @Attributes(required = true)
    private Calendar data;
    @XmlElement
    @Attributes(required = true)
    private IdentificadorTipoDto tipo;

    public IdentificadorDto() {
    }

    public IdentificadorDto(String id, IndividuoDto individuo, String designacao, AreaGeograficaDto area,
                            String emissor, Calendar data, IdentificadorTipoDto tipo) {
        this.id = id;
        this.individuo = individuo;
        this.designacao = designacao;
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

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignação(String designacao) {
        this.designacao = designacao;
    }

    public AreaGeograficaDto getArea() {
        return area;
    }

    public void setArea(AreaGeograficaDto area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public IdentificadorTipoDto getTipo() {
        return tipo;
    }

    public void setTipo(IdentificadorTipoDto tipo) {
        this.tipo = tipo;
    }
}

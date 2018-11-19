package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;
import com.github.reinert.jjschema.Attributes;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

@XmlRootElement
public class MunicipioDto extends GenericDto implements DtoInterface {
    @XmlElement
    @Attributes(required = true, maxLength = 7)
    private String codigo;
    @XmlElement
    @Attributes(required = true, maxLength = 2)
    private String estado;
    @XmlElement
    @Attributes
    private String municipio;

    public MunicipioDto() {
    }

    public MunicipioDto(String codigo, String estado, String municipio) {
        this.codigo = codigo;
        this.estado = estado;
        this.municipio = municipio;
    }

    public static MunicipioDto fromJson(String json) {
        MunicipioDto obj = GenericDto.fromJson(json, MunicipioDto.class);
        return obj;
    }

    public static MunicipioDto fromJson(File json) throws FileNotFoundException {
        MunicipioDto obj = GenericDto.fromJson(json, MunicipioDto.class);
        return obj;
    }

    public static MunicipioDto fromJson(Path json) throws FileNotFoundException {
        MunicipioDto obj = GenericDto.fromJson(json.toFile(), MunicipioDto.class);
        return obj;
    }


    public static MunicipioDto fromXml(String xml) throws JAXBException {
        MunicipioDto obj = GenericDto.fromXml(xml, MunicipioDto.class);
        return obj;
    }

    public static MunicipioDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        MunicipioDto obj = GenericDto.fromXml(xml, MunicipioDto.class);
        return obj;
    }

    public static MunicipioDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        MunicipioDto obj = GenericDto.fromXml(xml.toFile(), EstadoDto.class);
        return obj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}

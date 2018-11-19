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
public class DataSeguimentoDto extends GenericDto {

    @XmlElement
    @Attributes(required = true, maxLength = 1)
    private String codigo;
    @XmlElement
    @Attributes
    private  String descricao;

    public DataSeguimentoDto() {
    }

    public DataSeguimentoDto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static DataSeguimentoDto fromJson(String json) {
        DataSeguimentoDto obj = GenericDto.fromJson(json, DataSeguimentoDto.class);
        return obj;
    }

    public static DataSeguimentoDto fromJson(File json) throws FileNotFoundException {
        DataSeguimentoDto obj = GenericDto.fromJson(json, DataSeguimentoDto.class);
        return obj;
    }

    public static DataSeguimentoDto fromJson(Path json) throws FileNotFoundException {
        DataSeguimentoDto obj = GenericDto.fromJson(json.toFile(), DataSeguimentoDto.class);
        return obj;
    }


    public static DataSeguimentoDto fromXml(String xml) throws JAXBException {
        DataSeguimentoDto obj = GenericDto.fromXml(xml, DataSeguimentoDto.class);
        return obj;
    }

    public static DataSeguimentoDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        DataSeguimentoDto obj = GenericDto.fromXml(xml, DataSeguimentoDto.class);
        return obj;
    }

    public static DataSeguimentoDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        DataSeguimentoDto obj = GenericDto.fromXml(xml.toFile(), DataSeguimentoDto.class);
        return obj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

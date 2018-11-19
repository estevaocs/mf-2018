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
public class NomeDto extends GenericDto {
    @XmlElement
    @Attributes(required = true, maxLength = 36)
    private String id;
    @XmlElement
    @Attributes(required = true)
    private IndividuoDto individuo;
    @XmlElement
    @Attributes
    private String titulos;
    @XmlElement
    @Attributes
    private String nomes;
    @XmlElement
    @Attributes
    private String sobrenomes;
    @XmlElement
    @Attributes
    private String sufixos;
    @XmlElement
    @Attributes(required = true)
    private NomePreferidoDto nomePreferido;
    @XmlElement
    @Attributes
    private UsoCondicionalDto usoCondicional;

    public NomeDto() {
    }

    public NomeDto(String id, IndividuoDto individuo, String titulos, String nomes, String sobrenomes, String sufixos, 
                   NomePreferidoDto nomePreferido, UsoCondicionalDto usoCondicional) {
        this.id = id;
        this.individuo = individuo;
        this.titulos = titulos;
        this.nomes = nomes;
        this.sobrenomes = sobrenomes;
        this.sufixos = sufixos;
        this.nomePreferido = nomePreferido;
        this.usoCondicional = usoCondicional;
    }
    
    public static NomeDto fromJson(String json) {
        NomeDto obj = GenericDto.fromJson(json, NomeDto.class);
        return obj;
    }

    public static NomeDto fromJson(File json) throws FileNotFoundException {
        NomeDto obj = GenericDto.fromJson(json, NomeDto.class);
        return obj;
    }

    public static NomeDto fromJson(Path json) throws FileNotFoundException {
        NomeDto obj = GenericDto.fromJson(json.toFile(), NomeDto.class);
        return obj;
    }
    
    public static NomeDto fromXml(String xml) throws JAXBException {
        NomeDto obj = GenericDto.fromXml(xml, NomeDto.class);
        return obj;
    }

    public static NomeDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        NomeDto obj = GenericDto.fromXml(xml, NomeDto.class);
        return obj;
    }

    public static NomeDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        NomeDto obj = GenericDto.fromXml(xml.toFile(), NomeDto.class);
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

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public NomePreferidoDto getNomePreferido() {
        return nomePreferido;
    }

    public void setNomePreferido(NomePreferidoDto nomePreferido) {
        this.nomePreferido = nomePreferido;
    }

    public UsoCondicionalDto getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(UsoCondicionalDto usoCondicional) {
        this.usoCondicional = usoCondicional;
    }
}

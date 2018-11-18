package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class NomeDto extends GenericDto {
    @XmlElement
    private String id;
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private String titulos;
    @XmlElement
    private String nomes;
    @XmlElement
    private String sobrenomes;
    @XmlElement
    private String sufixos;
    @XmlElement
    private NomePreferidoDto nomePreferido;
    @XmlElement
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

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
    
}

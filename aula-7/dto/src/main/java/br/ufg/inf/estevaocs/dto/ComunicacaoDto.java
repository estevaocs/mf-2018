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
public class ComunicacaoDto extends GenericDto {
    @XmlElement
    private IndividuoDto individuo;
    @XmlElement
    private ComunicacaoMeioDto comunicacaoMeio;
    @XmlElement
    private  ComunicacaoPreferenciaDto comunicacaoPreferencia;
    @XmlElement
    private String detalhe;
    @XmlElement
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

    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

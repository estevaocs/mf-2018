package br.ufg.inf.estevaocs.dto;

import br.ufg.inf.estevaocs.DtoInterface;
import br.ufg.inf.estevaocs.GenericDto;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@XmlRootElement
public class EnderecoLinhaDto extends GenericDto implements DtoInterface {

    @XmlElement
    private String endereco;
    @XmlElement
    private String linha;
    @XmlElement
    private Integer ordem;

    public EnderecoLinhaDto() {
    }

    public EnderecoLinhaDto(String endereco, String linha, Integer ordem) {
        this.endereco = endereco;
        this.linha = linha;
        this.ordem = ordem;
    }

    public static EnderecoLinhaDto fromJson(String json) {
        EnderecoLinhaDto obj = GenericDto.fromJson(json, EnderecoLinhaDto.class);
        return obj;
    }

    public static EnderecoLinhaDto fromJson(File json) throws FileNotFoundException {
        EnderecoLinhaDto obj = GenericDto.fromJson(json, EnderecoLinhaDto.class);
        return obj;
    }

    public static EnderecoLinhaDto fromJson(Path json) throws FileNotFoundException {
        EnderecoLinhaDto obj = GenericDto.fromJson(json.toFile(), EnderecoLinhaDto.class);
        return obj;
    }


    public static EnderecoLinhaDto fromXml(String xml) throws JAXBException {
        EnderecoLinhaDto obj = GenericDto.fromXml(xml, EnderecoLinhaDto.class);
        return obj;
    }

    public static EnderecoLinhaDto fromXml(File xml) throws JAXBException, FileNotFoundException {
        EnderecoLinhaDto obj = GenericDto.fromXml(xml, EnderecoLinhaDto.class);
        return obj;
    }

    public static EnderecoLinhaDto fromXml(Path xml) throws JAXBException, FileNotFoundException {
        EnderecoLinhaDto obj = GenericDto.fromXml(xml.toFile(), EnderecoLinhaDto.class);
        return obj;
    }
    public String toJson() throws IOException {
        return super.toJson();
    }

    public String toXml() throws JAXBException, IOException {
        return super.toXml();
    }
}

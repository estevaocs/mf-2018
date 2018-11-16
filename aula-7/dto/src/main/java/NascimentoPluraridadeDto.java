import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NascimentoPluraridadeDto extends GenericDto  implements  DtoInterface{

    @XmlAttribute
    private Integer codigo;

    @XmlElement
    private String  descricao;

    public NascimentoPluraridadeDto() {
    }

    public NascimentoPluraridadeDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static NascimentoPluraridadeDto fromJson(String json) {
        return GenericDto.fromJson(json, NascimentoPluraridadeDto.class);
    }

    public static NascimentoPluraridadeDto fromXml(String xml) throws JAXBException {
        return GenericDto.fromXml(xml, NascimentoPluraridadeDto.class);
    }
}

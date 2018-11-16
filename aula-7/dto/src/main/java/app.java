import javax.xml.bind.JAXBException;

public class app {


    public static void main(String[] args) {
        NascimentoPluraridadeDto n = new NascimentoPluraridadeDto(1, "o3");
        System.out.println(n.toJson());
        n = NascimentoPluraridadeDto.fromJson("{\"codigo\":2,\"descricao\":\"great\"}");
        System.out.println(n.toJson());
        n = NascimentoPluraridadeDto.fromJson("{\"codigo\":3,\"descricao\":\"nice\"}");
        System.out.println(n.toJson());
        try {
            System.out.println(n.toXml());
            n = NascimentoPluraridadeDto.fromXml("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><nascimentoPluraridadeDto codigo=\"4\"><descricao>novidade</descricao></nascimentoPluraridadeDto>");
            System.out.println(n.toJson());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

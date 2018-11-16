import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;

public class GenericDto<T> {



    protected static <T> T fromJson(String json, Class<?> src) {
        Gson gson = new Gson();
        return gson.fromJson(json, (Type) src);
    }

    protected String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    protected static <T> T fromXml(String xml, Class<?> src) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(src);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader rd = new StringReader(xml);
       return (T) unmarshaller.unmarshal(rd);
    }

    protected String toXml() throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(this.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            StringWriter sw = new StringWriter();
            marshaller.marshal(this, sw);
            return sw.toString();
    }


}

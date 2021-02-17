package digitalsignatures.service;

import digitalsignatures.dao.WireTransfer103DAO;
import digitalsignatures.db.ConnectDB;
import digitalsignatures.model.WireTransfer103;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.io.StringWriter;

public class ObjectToXml {
    public static String jaxbObjectToXML() throws Exception{
        String xmlString = "";

        JAXBContext contextObj = JAXBContext.newInstance(WireTransfer103.class);
        Marshaller marshallerObj = contextObj.createMarshaller();

        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // To format XML

        WireTransfer103 wireTransfer103 = WireTransfer103DAO.getData(ConnectDB.CreateConnection());
        StringWriter sw = new StringWriter();
        marshallerObj.marshal(wireTransfer103, sw);
        xmlString = sw.toString();

        // Hiển thị trên console
        //marshallerObj.marshal(wireTransfer103, System.out);
        // Ghi vào file xml
        //marshallerObj.marshal(wireTransfer103, new FileOutputStream("wireTransfer103.xml"));

        return xmlString;
    }
}

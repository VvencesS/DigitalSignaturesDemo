package digitalsignatures.service;

import digitalsignatures.dao.WireTransfer103DAO;
import digitalsignatures.db.ConnectDB;
import digitalsignatures.model.WireTransfer103;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;

public class ObjectToXml {
    public static void execute() throws Exception{
        JAXBContext contextObj = JAXBContext.newInstance(WireTransfer103.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        WireTransfer103 wireTransfer103 = WireTransfer103DAO.getData(ConnectDB.CreateConnection());

        // Hiển thị trên console
        marshallerObj.marshal(wireTransfer103, System.out);
        // Ghi vào file xml
        marshallerObj.marshal(wireTransfer103, new FileOutputStream("wireTransfer103.xml"));
    }
}

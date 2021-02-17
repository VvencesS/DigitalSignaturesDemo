package digitalsignatures.dao;

import digitalsignatures.model.SignedDocument;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignedDocumentDAO {
    public static SignedDocument getData(Connection conn){
        PreparedStatement ptmt = null;
        String sql = "SELECT * FROM signedocument";
        SignedDocument sd = null;

        try {
            ptmt = conn.prepareStatement(sql);

            ResultSet rs = ptmt.executeQuery();

            while(rs.next()) {
                int document = rs.getInt("document");
                byte[] signature = rs.getBytes("signature");

                sd = new SignedDocument(document, signature);
            }
            ptmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sd;
    }
    public static void InsertData(Connection conn, SignedDocument sd) {
        String sql = "insert into signedocument(document, signature) values(?,?)";

        try {
            PreparedStatement ptmt = conn.prepareStatement(sql);

            ptmt.setInt(1, sd.getDocument());
            ptmt.setBytes(2, sd.getSignate());

            int kt = ptmt.executeUpdate();
            if(kt != 0) {
                System.out.println("Insert data success!");
            }else {
                System.out.println("Insert data fail!");
            }

            ptmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package digitalsignatures.usingmysql;

import digitalsignatures.ConnectDB;

import java.sql.*;

public class DigitalSignaturesUsingMySQL {
    public static void main(String[] args) {
        Connection conn = ConnectDB.CreateConnection();

        if(conn != null) {
//            try{
                System.out.println("Kết nối thành công!");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        } else{
            System.out.println("Kết nối thất bại!");
        }
    }
}

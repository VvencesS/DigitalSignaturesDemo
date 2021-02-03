package digitalsignatures;

import java.sql.*;

public class ConnectDB {
    public static Connection CreateConnection() {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/digsigndemo";
        String username = "root";
        String password = "MeoLuoi99";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}

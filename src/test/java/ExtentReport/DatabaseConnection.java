package ExtentReport;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connection(String URL, String userName, String password) throws SQLException{
        return DriverManager.getConnection(URL,userName, password);
    }

    public static void CloseConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}

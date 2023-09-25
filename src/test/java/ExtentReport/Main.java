package ExtentReport;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    static String URL = "jdbc:postgresql://localhost:5432/dvdrental";
    static String userName = "postgres";
    static String password = "123";



    public static void main(String[] args) throws SQLException {
        get();
    }

    public static Connection get(){

        try {
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("connected");


        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

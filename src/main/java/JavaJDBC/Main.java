package JavaJDBC;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static String URL = "jdbc:postgresql://localhost:5432/dvdrental";
    static String userName = "postgres";
    static String password = "123";



    public static void main(String[] args) throws SQLException {
        // get();
        //Update();
        //Create();
        //Delete();
        //getFilm();
        //UpdateFilm();
        //CreateFilm();
        DeleteFilm();
    }

    public static void get(){

        try {
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("connected");

            PostgresQuery.SelectQuery(connection);

            DatabaseConnection.CloseConnection(connection);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void Update(){
        try {
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("Connected");

            int idToUpdate = 1;
            String updatedName = "Cruz";

            PostgresQuery.UpdateQuery(connection,idToUpdate,updatedName);

            DatabaseConnection.CloseConnection(connection);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void Create(){
        try{
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("connected");

            int id = 201;
            String first_name = "Mark";
            String last_name = "Webber";

            PostgresQuery.Create(connection,id,first_name,last_name);

            DatabaseConnection.CloseConnection(connection);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void Delete(){
        try {
            Connection connection =DatabaseConnection.connection(URL,userName,password);
            System.out.println("Connected");

            List<Integer> idsToDelete = new ArrayList<>(Arrays.asList(201,202));
            PostgresQuery.Delete(connection,idsToDelete);

            DatabaseConnection.CloseConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //==========================================================================================
    //================================== FILM QUERIES BELOW ====================================
    //==========================================================================================
    public static void getFilm(){

        try {
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("connected");

            PostgresQuery.SelectFilmQuery(connection);

            DatabaseConnection.CloseConnection(connection);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void UpdateFilm(){
        try {
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("Connected");

            int idToUpdate = 1;
            String updatedTitle = "Mission Impossible";

            PostgresQuery.UpdateFilmQuery(connection,idToUpdate,updatedTitle);

            DatabaseConnection.CloseConnection(connection);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void CreateFilm(){
        try{
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("connected");

            int id = 1005;
            String title = "Patrick's Film";
            String description = "A film patrick created with iMovie.";
            int language_id = 1;

            PostgresQuery.CreateFilm(connection,id,title,description,language_id);

            DatabaseConnection.CloseConnection(connection);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void DeleteFilm(){
        try {
            Connection connection =DatabaseConnection.connection(URL,userName,password);
            System.out.println("Connected");

            List<Integer> idsToDelete = new ArrayList<>(Arrays.asList(1005));
            PostgresQuery.DeleteFilm(connection,idsToDelete);

            DatabaseConnection.CloseConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
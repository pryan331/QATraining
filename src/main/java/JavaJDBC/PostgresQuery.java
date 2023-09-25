package JavaJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostgresQuery {

    public static void SelectQuery(Connection connection){
        try {
            Statement statement = connection.createStatement();
            String Query = "SELECT * from actor LIMIT 10";
            ResultSet resultSet = statement.executeQuery(Query);

            while (resultSet.next()){
                int id = resultSet.getInt("actor_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("ID: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void UpdateQuery(Connection connection,int IdtoUpdate,String UpdatedName){

        try {
            String UpdateQuery = "UPDATE actor SET last_name = ? WHERE actor_id = ?";
            String getUpdated = "SELECT actor_id,first_name,last_name from actor where actor_id = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(UpdateQuery);
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement1.executeQuery(getUpdated);

            preparedStatement.setString(1,UpdatedName);
            preparedStatement.setInt(2,IdtoUpdate);

            int rowsUpdated = preparedStatement.executeUpdate();

            while (resultSet.next()){
                int id = resultSet.getInt("actor_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("ID: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
            }
            resultSet.close();
            statement1.close();


            if (rowsUpdated > 0){
                System.out.println("Update Success");
            }else {
                System.out.println("Update Failed");
            }
            preparedStatement.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static  void Create(Connection connection,int actor_id,String first_name,String last_name){

        try {
            String InsertQuery = "INSERT INTO actor(actor_id,first_name,last_name) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);


            preparedStatement.setInt(1,actor_id);
            preparedStatement.setString(2,first_name);
            preparedStatement.setString(3,last_name);

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0){
                System.out.println("Record Created");
            }else {
                System.out.println("record Insert Fail");
            }
            preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void Delete(Connection connection, List<Integer> idsToDelete){
        try {
            if (idsToDelete.isEmpty()){
                System.out.println("no id provided");
                return;
            }

            String deleteQuery = "DELETE FROM actor where actor_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            for (int id : idsToDelete){
                preparedStatement.setInt(1,id);
                preparedStatement.addBatch();
            }

            int [] rowsDeleted = preparedStatement.executeBatch();

            int totalRowsDeleted = 0;
            for (int deletedRows : rowsDeleted){
                totalRowsDeleted += deletedRows;
            }
            System.out.println("total rows deleted: " + totalRowsDeleted);

            preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }










    public static void SelectFilmQuery(Connection connection){
        try {
            Statement statement = connection.createStatement();
            String Query = "SELECT * from film LIMIT 10";
            ResultSet resultSet = statement.executeQuery(Query);

            while (resultSet.next()){
                int id = resultSet.getInt("film_id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                System.out.println("ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void UpdateFilmQuery(Connection connection,int IdtoUpdate,String UpdatedTitle){

        try {
            String UpdateQuery = "UPDATE film SET title = ? WHERE film_id = ?";
            String getUpdated = "SELECT film_id,title,description from film where film_id = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(UpdateQuery);
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement1.executeQuery(getUpdated);

            preparedStatement.setString(1,UpdatedTitle);
            preparedStatement.setInt(2,IdtoUpdate);

            int rowsUpdated = preparedStatement.executeUpdate();

            while (resultSet.next()){
                int id = resultSet.getInt("film_id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                System.out.println("ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
            }
            resultSet.close();
            statement1.close();


            if (rowsUpdated > 0){
                System.out.println("Update Success");
            }else {
                System.out.println("Update Failed");
            }
            preparedStatement.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static  void CreateFilm(Connection connection,int film_id,String title,String description,int language_id){

        try {
            String InsertQuery = "INSERT INTO film(film_id,title,description,language_id) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);


            preparedStatement.setInt(1,film_id);
            preparedStatement.setString(2,title);
            preparedStatement.setString(3,description);
            preparedStatement.setInt(4,language_id);

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0){
                System.out.println("Record Created");
            }else {
                System.out.println("record Insert Fail");
            }
            preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void DeleteFilm(Connection connection, List<Integer> idsToDelete){
        try {
            if (idsToDelete.isEmpty()){
                System.out.println("no id provided");
                return;
            }

            String deleteQuery = "DELETE FROM film where film_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            for (int id : idsToDelete){
                preparedStatement.setInt(1,id);
                preparedStatement.addBatch();
            }

            int [] rowsDeleted = preparedStatement.executeBatch();

            int totalRowsDeleted = 0;
            for (int deletedRows : rowsDeleted){
                totalRowsDeleted += deletedRows;
            }
            System.out.println("total rows deleted: " + totalRowsDeleted);

            preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
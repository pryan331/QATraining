package ExtentReport;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class TestPostgres {
    private static final String URL = "jdbc:postgresql://localhost:5432/dvdrental";
    private static final String userName = "postgres";
    private static final String password = "123";
    private final String filePath = "/Users/patrickryan/Desktop/userData.xlsx";
    private FileInputStream fis;
    private Workbook workbook;
    private Connection connection;

    @BeforeClass
    public void setup() throws IOException {
        fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
    }

    @AfterClass
    public void teardown() throws IOException {
        if (fis != null) {
            fis.close();
        }
        if (workbook != null) {
            workbook.close();
        }
    }

    @BeforeMethod
    public void makeConnection() {
        try {
            connection = DriverManager.getConnection(URL, userName, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeConnectionAndStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void SelectQuery() {
        try {
            Statement statement = connection.createStatement();
            String Query = "SELECT * from actor LIMIT 1";
            ResultSet resultSet = statement.executeQuery(Query);

            while (resultSet.next()) {
                int id = resultSet.getInt("actor_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println("Actual: ");
                System.out.println("ID: " + id);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
                System.out.println("Expected: " + 2 + " Nick Wahlberg");
                Assert.assertEquals(id, 2);
                Assert.assertEquals(firstName, "Nick");
                Assert.assertEquals(lastName, "Wahlberg");

                System.out.println();
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        Sheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][columnCount];

        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString();
            }
        }
        return data;
    }

    @Test(dataProvider = "userData")
    public void testUser(String id, String firstName, String lastName) {
        System.out.println("Testing user with ID: " + id + " and First Name: " + firstName + " and Last Name: " + lastName);

        boolean userResult = performUserCheck(id, firstName, lastName);

        assert userResult : "User failed for ID: " + id + " and First Name: " + firstName + " and Last Name: " + lastName;
    }


    private boolean performUserCheck(String id, String firstName, String lastName) {

        return Objects.equals(id, "2.0") && Objects.equals(firstName, "Nick") && Objects.equals(lastName, "Wahlberg");
    }
}
package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataDrivenTest {

//    @DataProvider(name = "additionData")
//    public Object[][] additionData(){
//        return new Object[][]{
//                {2,3,5},
//                {0,1,1},
//                {-1,1,0},
//                {10,-5,5}
//        };
//    }
//
//    @Test(dataProvider = "additionData")
//    public void testAddition(int num1, int num2, int ExpectedResult){
//        int result = num1 + num2;
//
//        Assert.assertEquals(result,ExpectedResult,"Addition test Failed");
//    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {

        String filePath = "/Users/patrickryan/Desktop/TestData.xlsx";

        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
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

        workbook.close();
        fis.close();

        return data;
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {

        System.out.println("Testing login with Username: " + username + " and Password: " + password);


        boolean loginResult = performLogin(username, password);


        assert loginResult : "Login failed for Username: " + username;
    }

    // Simulated login logic
    private boolean performLogin(String username, String password) {
        //Selenium logic... Making login attempts multiple times with test Data
        return true;
    }
}
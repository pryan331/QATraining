package org.java;
//Java IO --> Input Output for file
// Java uses the  concept of stream to make IO operation faster.

//Java IO package contains all the required input and output operations.
//File handling in Java by IO API


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

//Stream -->
//A stream is a sequence of data in java which is composed of bytes.
//System.out -- Standard output stream
//St\ystem.in -- Standard input stream

//InputStream OutputStream
//java explain of output stream and inputStream
//OutputStream
//java uses output stream to write data to a destination. it may be a file, an array.
//InputStream
//Java application uses an inputStream to read data from source, it may be a file, an array.





import java.io.IOException;
public class FileIO {
    public static void main(String[] args) throws IOException {
        //System.out.println("This is a standard output.");
        //System.err.println("this is a standard error.");
        //System.out.println("Input a single letter: ");
        //int i = System.in.read();
        //System.out.println((char)i);
        //WriteToFile();
        //ReadFile();
        //ExcelWrite();
        ReadExcel();
    }
    public static void WriteToFile() throws IOException{
        String content = "This is the content to write to the file.";
        try{
            String filePath = "/Users/patrickryan/Desktop/text.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            writer.close();
            System.out.println("the content has been written to the file.");
        } catch(IOException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
    public static void ReadFile(){
        try{
            String filePath = "/Users/patrickryan/Desktop/text.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String Line;
            while((Line = reader.readLine()) != null){
                System.out.println(Line);
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void ExcelWrite() throws IOException {
        try (Workbook workbook = new XSSFWorkbook()){

            Sheet sheet = workbook.createSheet("Sheet1");

            String[][] data = {
                    {"Row 1 Cell 1","Row 1 Cell 2","Row 1 Cell 3"},
                    {"Row 2 Cell 1","Row 2 Cell 2","Row 2 Cell 3"}
            };

            for (int i = 0; i< data.length;i++){
                Row row = sheet.createRow(i);
                for (int j = 0;j< data[i].length;j++){
                    Cell cell = row.createCell(j);
                    cell.setCellValue(data[i][j]);
                }
            }
            try(FileOutputStream outputStream = new
                    FileOutputStream("/Users/patrickryan/Desktop/example.xlsx")){
                workbook.write(outputStream);

                System.out.println("Excel File has been written");
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void ReadExcel(){
        try(Workbook workbook =
                new XSSFWorkbook(new FileInputStream("/Users/patrickryan/Desktop/example.xlsx"))) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                StringBuilder rowData = new StringBuilder();
                for (Cell cell : row) {
                    String cellValue = cell.getStringCellValue();
                    rowData.append(cellValue).append(" | ");
                }
                System.out.println(rowData.substring(0, rowData.length() - 1));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }










}

package JavaPackage;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcel {
    public static void main(String[] args) {  

        try (Workbook workbook = new XSSFWorkbook()) {  
            Sheet sheet = workbook.createSheet("Sheet1");

            Object[][] data = {
                {"Name", "Age", "Email"},
                {"John Doe", 30, "john@test.com"},
                {"Jane Doe", 28, "john@test.com"},
                {"Bob Smith", 35, "jacky(@example.com"},
                {"Swapnil", 37, "swapnil@example.com"}
            };

            int rowCount = 0;
            for (Object[] rowData : data) {
                Row row = sheet.createRow(rowCount++);
                int colCount = 0;
                for (Object field : rowData) {
                    Cell cell = row.createCell(colCount++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }

            
            for (int i = 0; i < data[0].length; i++) {
                sheet.autoSizeColumn(i);
            }

            try (FileOutputStream fos = new FileOutputStream("example.xlsx")) {
                workbook.write(fos);
                System.out.println("Excel file 'example.xlsx' written successfully.");
            } catch (IOException e) {
                System.err.println("Error writing Excel file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error creating excel workbook: " + e.getMessage());
        }

    }  
}      

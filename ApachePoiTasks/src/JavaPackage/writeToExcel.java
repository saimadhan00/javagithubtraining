package JavaPackage;


	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileOutputStream;
	import java.io.IOException;

	public class writeToExcel {
	    public static void main(String[] args) {
	       
	        Workbook workbook = new XSSFWorkbook();

	        
	        Sheet sheet = workbook.createSheet("Sheet1");

	       
	        String[][] data = {
	            {"Name", "Age", "Email"},
	            {"Madhan kumar", "26", "madhan@123.com"},
	            {"sachin tendulkar", "50", "sachin@test.com"},
	            {"Rohit Sharma", "35", "rohit(@example.com"},
	            {"Virat kholi", "37", "Kholi@example.com"}
	        };

	       
	        int rowCount = 0;

	        for (String[] aData : data) {
	            Row row = sheet.createRow(rowCount++);
	            int columnCount = 0;
	            for (String field : aData) {
	                Cell cell = row.createCell(columnCount++);
	                cell.setCellValue(field);
	            }
	        }

	        
	        for (int i = 0; i < data[0].length; i++) {
	            sheet.autoSizeColumn(i);
	        }

	       
	        try (FileOutputStream outputStream = new FileOutputStream("testdata.xlsx")) {
	            workbook.write(outputStream);
	            System.out.println("Excel file 'testdata.xlsx' written successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

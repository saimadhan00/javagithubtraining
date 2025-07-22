package JavaPackage;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheetExample {
    public static void main(String[] args) {
       
        try (Workbook workbook = new XSSFWorkbook()) {
            // Create a new sheet named "Sheet1"
            Sheet sheet = workbook.createSheet("Sheet1");

            System.out.println("Sheet named '" + sheet.getSheetName() + "' created successfully.");

            
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}

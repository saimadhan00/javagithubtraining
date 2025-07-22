package JavaPackage;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelWorkbook {
    public static void main(String[] args) {
        try {
            Workbook workbook = new XSSFWorkbook();

            System.out.println("New Excel workbook created.");

            
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

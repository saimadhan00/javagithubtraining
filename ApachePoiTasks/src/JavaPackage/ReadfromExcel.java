package JavaPackage;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class ReadfromExcel {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "./Datafiles/TestDataFiles.xlsx";
        FileInputStream inputstream = new FileInputStream(excelFilePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Print details for row 1, 2, 3 (indexes 1, 2, 3)
        for (int rowIndex = 1; rowIndex <= 3; rowIndex++) {
            XSSFRow row = sheet.getRow(rowIndex);
            if (row != null) {
                System.out.print("Row " + rowIndex + " : ");
                for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {
                    XSSFCell cell = row.getCell(cellIndex);
                    if (cell != null) {
                        System.out.print(cell.toString() + "\t");
                    }
                }
                System.out.println();
            }
        }

        workbook.close();
        inputstream.close();
    }
}

package apachiPOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class neu_Excel {

    public static void main(String[] args) throws IOException {
      XSSFWorkbook workbook=new XSSFWorkbook();
      XSSFSheet sheet = workbook.createSheet("Tabelle1");

      Row row = sheet.createRow(0);
      Cell cell=row.createCell(0);
      cell.setCellValue("Reifen");

      FileOutputStream fileOutputStream=new FileOutputStream("src/test/java/apachiPOI/resourcess/neu_Excel2(1).xlsx");
      workbook.write(fileOutputStream);
      workbook.close();
      fileOutputStream.close();


    }



}

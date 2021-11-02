package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    public static List<List<String>> getList(String path,String sheetName,int columnCount){
        List<List<String>> returnList=new ArrayList<>();

        Workbook workbook=null;
        FileInputStream fileInputStream= null;
        
        try {
            fileInputStream = new FileInputStream(path);
            workbook= WorkbookFactory.create(fileInputStream);
        }  catch (IOException e) {
            e.printStackTrace();
        }

       Sheet sheet=workbook.getSheet(sheetName);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowCount ; i++) {
            List<String> rowList=new ArrayList<>();
            Row row=sheet.getRow(i);
            for (int j = 0; j <columnCount ; j++) {
                rowList.add(row.getCell(j).toString());
            }
            returnList.add(rowList);
        }
        return  returnList;

    }


    public static void writeExcel(String path,String scenarioName,String browsername,String date,String status){


        File f=new File(path);
        String sheetName="Tabelle1";
        if(!f.exists()){
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet(sheetName);

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(scenarioName);

        cell= row.createCell(1);
        cell.setCellValue(status);

        cell= row.createCell(2);
        cell.setCellValue(browsername);

        cell=row.createCell(3);
        cell.setCellValue(date);

            try {
                FileOutputStream fileOutputStream=new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        else {

            FileInputStream fileInputStream= null;
            Workbook workbook= null;

            try {
                fileInputStream = new FileInputStream(path);
                 workbook=WorkbookFactory.create(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Sheet sheet = workbook.getSheet(sheetName);
            int rownum=sheet.getPhysicalNumberOfRows();
            Row row = sheet.createRow(rownum);

            Cell cell = row.createCell(0);
            cell.setCellValue(scenarioName);

            cell= row.createCell(1);
            cell.setCellValue(status);

            cell= row.createCell(2);
            cell.setCellValue(browsername);

            cell=row.createCell(3);
            cell.setCellValue(date);

            try {
                fileInputStream.close();
                FileOutputStream fileOutputStream=new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        List<List<String>> excelList=getList("src/test/java/apachiPOI/resourcess/neu_Excel2(1).xlsx","Tabelle1",1);

        System.out.println("excelList = " + excelList);
    }
}

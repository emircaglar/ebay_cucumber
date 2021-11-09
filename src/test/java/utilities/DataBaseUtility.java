package utilities;

import _jdbc.parent._jdbcParent;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseUtility  {

    private static Connection connection;
    protected static Statement statement;

    @BeforeTest
    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/ts_ebay";
        String name = "technostudy";
        String password = "zhTPis0l9#$&";
        try {
            connection = DriverManager.getConnection(url, name, password);
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @AfterTest
    public static void DBConnectionClose()  {

        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }






    public static List<List<String>> getListData(String Query) {
        DBConnectionOpen();
        List<List<String>> datalist = new ArrayList<>();


        try {
            ResultSet rs = statement.executeQuery(Query);

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            while (rs.next()) {

                List<String> rowlist = new ArrayList<>();

                for (int i = 1; i <=columnCount; i++) {
                    rowlist.add(rs.getString(i));
                }
                datalist.add(rowlist);


            }
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

       DBConnectionClose();
        return datalist;
    }


    public static void main(String[] args) {
        List<List<String>>data=getListData("select * from product");
        System.out.println("data = " + data);
    }
    
    
}

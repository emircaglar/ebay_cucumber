package _jdbc.tagen;

import org.testng.annotations.Test;

import java.sql.*;


public class _01_Intro {

    @Test
    public void test1() throws SQLException {

        String url = "jdbc:mysql://test.medis.mersys.io:33306/ts_ebay";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";


        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from product");

        rs.next();

        String product = rs.getString("name");
        String id = rs.getString(1);

        System.out.println("id = " + id);
        System.out.println("product = " + product);

        rs.next();
        product = rs.getString("name");
        id = rs.getString(1);

        System.out.println("id = " + id);
        System.out.println("product = " + product);
        connection.close();
    }


}

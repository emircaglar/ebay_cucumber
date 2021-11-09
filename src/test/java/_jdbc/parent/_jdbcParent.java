package _jdbc.parent;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _jdbcParent {
    private Connection connection;
    protected Statement statement;

    @BeforeTest
    public void befortest() {
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
    public void aftertest()  {

        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

package _jdbc.tagen;

import _jdbc.parent._jdbcParent;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.Collection;

public class _02_BeforeAfter extends _jdbcParent {


    @Test
    public void test1() throws SQLException {


        ResultSet rs = statement.executeQuery("select * from product");
        rs.last();
        String last = rs.getString("name");
        System.out.println("last = " + last);
        rs.first();
        String first = rs.getString("name");
        System.out.println("first = " + first);
        rs.absolute(1);
        String first_absolute = rs.getString("name");
        System.out.println("first_absolute = " + first_absolute);
        rs.relative(1);
        String zweite_relativ = rs.getString("name");
        System.out.println("zweite_relativ = " + zweite_relativ);


    }
}

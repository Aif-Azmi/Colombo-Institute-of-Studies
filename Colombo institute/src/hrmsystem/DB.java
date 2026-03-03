/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrmsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Aif
 */
public class DB {

    public static Connection c;
    public static int userid;
    public static String usertype;
    public static String password;

    public static Connection createCon() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmsystem", "root", "");

        return c;

    }

    public static void iud(String sql) throws Exception {

        if (c == null) {
            createCon();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {

        if (c == null) {
            createCon();
        }
        return c.createStatement().executeQuery(sql);
    }

}

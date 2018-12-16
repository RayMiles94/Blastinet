package com.org.tigerapps.blastinet;
import java.sql.*;
public class Connection {
    private static String driver ="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/blasti.net";
    private static String username="root";
    private static String password="";

    public static Connection Connect() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        return conn;

    }
    public void insert(){
        String query ="INSERT INTO ";
    }
}
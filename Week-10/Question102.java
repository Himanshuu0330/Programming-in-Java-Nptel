import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Question102 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

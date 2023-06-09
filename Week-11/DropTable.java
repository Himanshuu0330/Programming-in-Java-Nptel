import java.sql.*;
import java.lang.*;

public class DropTable {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            String query = "";

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            String st = "drop table PLAYERS";
            stmt.executeUpdate(st);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

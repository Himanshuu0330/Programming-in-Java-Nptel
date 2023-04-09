import java.sql.*;
import java.lang.*;

public class InsertData {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            String CREATE_TABLE_SQL = "CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
            // Execute the statement containing SQL command
            stmt.executeUpdate(CREATE_TABLE_SQL);
            PreparedStatement stmt1 = conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
            stmt1.setInt(1, 1);
            stmt1.setString(2, "Ram");
            stmt1.setString(3, "Gopal");
            stmt1.setInt(4, 26);
            int i = stmt1.executeUpdate();
            PreparedStatement stmt2 = conn.prepareStatement("insert into PLAYERS values(?,?,?,?)");
            stmt2.setInt(1, 2);
            stmt2.setString(2, "John");
            stmt2.setString(3, "Mayer");
            stmt2.setInt(4, 22);
            int i1 = stmt2.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

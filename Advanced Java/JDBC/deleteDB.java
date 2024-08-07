import java.sql.*;

public class deleteDB {
        public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "123");
        Statement stmt = conn.createStatement();

        stmt.executeUpdate("drop table demo");
        System.out.println("demo database deleted.");
    }
}

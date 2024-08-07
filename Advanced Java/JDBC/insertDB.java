import java.sql.*;

class insertDB {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "123");
        Statement stmt = conn.createStatement();

        stmt.executeUpdate("insert into Students values(4, 'Muskaan', 'CE')");
        System.out.println("One Row Inserted in Database Students.");
    }
}

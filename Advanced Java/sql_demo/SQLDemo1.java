import java.sql.*;

/**
 * Create User
 * CMD: sudo mysql -uroot
 * 
 *      NOTE: don't forget to replace %USER% and %PASS% with actual values.
 * 
 *      mysql> CREATE USER '%USER%'@'localhost' IDENTIFIED BY '%PASS%';
 *      mysql> SELECT user,authentication_string,plugin,host FROM mysql.user;
 *      mysql> GRANT ALL PRIVILEGES ON *.* TO '%USER%'@'localhost';
 * 
 * CMD: mysql -u %USER% -p
 *  Enter password: %PASS%
 *  
 * 
 * https://dev.mysql.com/downloads/connector/j/
 * Run -> java -cp "mysql-connector-j-8.1.0.jar:." SQLDemo1
 * 
 */

public class SQLDemo1 {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "newuser", "Pass123$");

        System.out.println("DB Connected");


        Statement st = conn.createStatement();
        st.executeUpdate("create database dummy");


    }

} 
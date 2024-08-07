import java.sql.*;

class createDB{

    public static void main(String args[]){
        try {
            String url = "jdbc:mysql://localhost:3306/College";
            String uname = "root";
            String pwd = "123";
            Connection conn = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("select *from Students");
            while(r.next()){
                System.out.println("Id: " + r.getString("Id") + " Name: " + r.getString("Name") + " Dept: " + r.getString("Dept"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}

//LINK for install JDBC: https://youtu.be/45383b8dNCI
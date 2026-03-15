import java.sql.*;

class DBConnection {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        if(con != null) {
            System.out.println("Database Connected Successfully");
        }

        con.close();
    }
}

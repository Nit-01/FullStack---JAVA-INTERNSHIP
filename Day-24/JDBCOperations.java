import java.sql.*;

class JDBCOperations {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student(id, name) VALUES(?, ?)");

        ps.setInt(1, 101);
        ps.setString(2, "Niteesh");

        ps.executeUpdate();
        System.out.println("Record inserted successfully");

        con.close();
    }
}
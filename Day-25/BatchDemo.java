import java.sql.*;

class BatchDemo {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student(id, name) VALUES(?, ?)");

        ps.setInt(1, 101);
        ps.setString(2, "Niteesh");
        ps.addBatch();

        ps.setInt(1, 102);
        ps.setString(2, "Rahul");
        ps.addBatch();

        ps.executeBatch();

        con.close();
        System.out.println("Batch executed successfully");

    }
}
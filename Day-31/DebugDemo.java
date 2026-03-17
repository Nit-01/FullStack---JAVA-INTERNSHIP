import java.sql.*;
import java.util.*;

class DebugDemo {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        if(id <= 0) {
            System.out.println("Invalid ID");
            return;
        }

        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM student WHERE id = ?");

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        } else {
            System.out.println("Record not found");
        }

        con.close();
    }
}

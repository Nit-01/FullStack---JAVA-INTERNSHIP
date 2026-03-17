import java.sql.*;
import java.util.*;

class MiniProjectDemo {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES(?, ?)");

        ps.setInt(1, id);
        ps.setString(2, name);

        ps.executeUpdate();
        System.out.println("Record Inserted");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        con.close();
    }
}

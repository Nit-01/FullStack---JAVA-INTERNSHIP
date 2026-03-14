import java.sql.*;

class MySQLConnectionDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO student VALUES(1,'Niteesh')");

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        con.close();
    }
}


import java.sql.*;

class TransactionDemo {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        con.setAutoCommit(false);

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO student VALUES(201, 'Niteesh')");
        st.executeUpdate("INSERT INTO student VALUES(202, 'Rahul')");

        con.commit();

        con.close();
        System.out.println("Transaction completed successfully");

    }
}
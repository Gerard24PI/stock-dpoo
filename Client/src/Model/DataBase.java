package Model;
import java.sql.*;

public class DataBase {

    private Connection conn;


    //Setting up JDBC: https://www.tutorialspoint.com/jdbc/jdbc-quick-guide.htm

    //stackoverflow.com/questions/42189714/android-how-to-work-with-complex-object-via-socket
    public DataBase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        final String USER = "username";     //Llegir de JSON
        final String PASS = "password";     //Llegir de JSON
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection("127.0.0.1:3306",USER,PASS);
    }
}

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:oracle:thin:@//db.cia.io.vn:1521/FREEPDB1"; // URL

    private static final String USER = "SMART_PARK"; // Username
    private static final String PASSWORD = "123456"; // Password

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD); // Establishes a connection to the database using the
                                                                 // provided URL, username, and password
    }
}
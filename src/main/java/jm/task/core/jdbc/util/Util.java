package jm.task.core.jdbc.util;
import com.mysql.cj.jdbc.NonRegisteringDriver;
import java.sql.*;


public class Util {
    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private final String name = "root";
    private final String password = "Bubonik23Descorue32";

    public Connection getConnection() {
        try {
            Driver driver = new NonRegisteringDriver();
            DriverManager.registerDriver(driver);
            return DriverManager.getConnection(URL, name, password);
        } catch (SQLException e) {
        }
        return connection;
    }
}
package ipl;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JDBCFactory {

    private JDBCFactory() {}

    public static Connection getConnection() throws SQLException {

        Properties prop = new Properties();

        try {

            prop.load(new FileReader("src/mysql.info"));

            System.out.println("Driver = " + prop.getProperty("driver"));
            System.out.println("URL = " + prop.getProperty("url"));
            System.out.println("User = " + prop.getProperty("user"));

            Class.forName(prop.getProperty("driver"));

            return DriverManager.getConnection(
                    prop.getProperty("url"),
                    prop.getProperty("user"),
                    prop.getProperty("pass"));

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();   // IMPORTANT
            throw new SQLException(e);
        }
    }
}
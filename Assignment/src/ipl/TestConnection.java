package ipl;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {

        try {

            Connection conn = JDBCFactory.getConnection();

            if (conn != null) {

                System.out.println("Connection Successful.");

                DatabaseMetaData meta = conn.getMetaData();

                System.out.println("Database Name    : " + meta.getDatabaseProductName());
                System.out.println("Database Version : " + meta.getDatabaseProductVersion());
                System.out.println("Driver Name      : " + meta.getDriverName());
                System.out.println("Driver Version   : " + meta.getDriverVersion());

                conn.close();
                System.out.println("Connection Closed.");

            } else {

                System.out.println("Connection Failed.");

            }

        } catch (SQLException e) {

            System.out.println("Error while connecting to database.");
            e.printStackTrace();

        }

    }

}
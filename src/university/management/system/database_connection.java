package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database_connection {
    Connection connection;
    Statement statement;

    database_connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///universitymanagement", "root", "Suvam@321");
            statement = connection.createStatement();
        } catch (Exception d) {
            d.printStackTrace();
        }
    }
}


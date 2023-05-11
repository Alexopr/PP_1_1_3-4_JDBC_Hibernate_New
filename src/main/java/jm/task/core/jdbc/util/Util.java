package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:MySQL://localhost:3306/my_db_114";
    private static final String userName = "root";
    private static final String password = "root";

    public static Connection getMySQLConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, userName, password);
            connection.setAutoCommit(false);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

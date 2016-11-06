package ru.innopolis.geraev.langtraining.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Rajiv on 05.11.2016.
 */
public class PostgreDaoFactory implements DaoFactory {
    private String username = "postgres";
    private String password = "innopolis";
    private String dbUrl = "jdbc:postgresql://localhost:5432/innopolis";
    private String dbDriver = "org.postgresql.Driver";

    public PostgreDaoFactory() {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//// TODO: 06.11.2016 dsdgsgs
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public UserDao getUsersDao(Connection connection) {
        return null;
    }
}

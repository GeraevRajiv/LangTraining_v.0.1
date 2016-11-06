package ru.innopolis.geraev.langtraining.dao;

import ru.innopolis.geraev.langtraining.entity.User;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Rajiv on 06.11.2016.
 */
public class PostgreUserDao implements UserDao {
    private Connection connection;

    public PostgreUserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User create(String username, String password) {
        return null;
    }

    @Override
    public User read(String username) {
        User user = null;
        //language=SQL
        String sql = "SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement psUsers = connection.prepareStatement(sql);
            psUsers.setString(1, username);
            ResultSet rs = psUsers.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}

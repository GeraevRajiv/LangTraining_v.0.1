package ru.innopolis.geraev.langtraining;

import ru.innopolis.geraev.langtraining.dao.PostgreDaoFactory;
import ru.innopolis.geraev.langtraining.dao.PostgreUserDao;
import ru.innopolis.geraev.langtraining.entity.User;

import java.sql.*;
import java.util.Collection;

/**
 * Created by Rajiv on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        PostgreDaoFactory postgreDaoFactory = new PostgreDaoFactory();
        Connection connection = postgreDaoFactory.getConnection();


        PostgreUserDao postgreUserDao = new PostgreUserDao(connection);
        User user = postgreUserDao.read("superadmin");

        System.out.println(user.getUsername() + " > " + user.getPassword());


            /*
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");

            while (rs.next()){
                System.out.println(rs.getObject(1) + "\t|\t" +
                        rs.getObject(2) + "\t|\t" +
                        rs.getObject(3));
            }

            System.out.println(">> = " + connection.getMetaData().getDatabaseProductName() + " " +
                    connection.getMetaData().getDatabaseProductVersion());
*/


    }
}

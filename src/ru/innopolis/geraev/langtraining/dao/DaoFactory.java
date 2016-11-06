package ru.innopolis.geraev.langtraining.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Rajiv on 05.11.2016.
 * Фабрика объектов для работы с базой данных
 */
public interface DaoFactory {

    /** Возвращает подключение к базе данных */
    public Connection getConnection() throws SQLException;

    /** Возвращает объект для управления персистентным состоянием объекта User */
    public UserDao getUsersDao(Connection connection);
}



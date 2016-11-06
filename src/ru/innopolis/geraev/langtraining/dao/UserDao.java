package ru.innopolis.geraev.langtraining.dao;

import ru.innopolis.geraev.langtraining.entity.User;
import java.util.List;

/**
 * Created by Rajiv on 05.11.2016.
 * Объект для управления персистентным состоянием объекта User
 */
public interface UserDao {

    /** Создает новую запись и соответствующий ей объект */
    public User create(String username, String password);

    /** Возвращает объект соответствующий записи с первичным ключом username или null */
    public User read(String username);

    /** Сохраняет состояние объекта group в базе данных */
//    public void update(User student);

    /** Удаляет запись об объекте из базы данных */
//    public void delete(User student);

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<User> getAll();
}
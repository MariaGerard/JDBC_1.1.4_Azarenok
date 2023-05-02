package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {
    private static final UserDaoJDBCImpl USER_DAO = new UserDaoJDBCImpl();
    @Override
    public void createUsersTable() {
        USER_DAO.createUsersTable();
    }
    @Override
    public void dropUsersTable() {
        USER_DAO.dropUsersTable();

    }
    @Override
    public void saveUser(String name, String lastName, byte age)  {
        USER_DAO.saveUser(name, lastName, age);


    }
    @Override
    public void removeUserById(long id) {
        USER_DAO.removeUserById(id);

    }
    @Override
    public List<User> getAllUsers() {
        return USER_DAO.getAllUsers();
    }
    @Override
    public void cleanUsersTable()  {
        USER_DAO.cleanUsersTable();

    }
}

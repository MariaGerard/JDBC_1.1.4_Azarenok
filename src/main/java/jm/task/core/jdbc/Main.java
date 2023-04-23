package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Bilbo", "Baggins", (byte) 55);
        userService.saveUser("Sarah", "Connor", (byte) 30);
        userService.saveUser("Django", "Unchained", (byte) 28);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}


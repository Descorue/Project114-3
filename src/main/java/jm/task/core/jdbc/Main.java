package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();


        userService.saveUser("Volodya", "Volodin", (byte) 55);
        userService.saveUser("Valera", "Valerin", (byte) 51 );
        userService.saveUser("Bogdan", "Bogdanov", (byte) 53);
        userService.saveUser("Vasiliy", "Vasiliyev", (byte) 54);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

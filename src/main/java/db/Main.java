package db;

import manager.UserManager;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        try {
            userManager.addUser(new User("poxos","poxosyan","poxos@mail.ru","15458"));
            List<User> allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
//            userManager.deleteUserById(5);
//            allUsers = userManager.getAllUsers();
//            for (User user : allUsers) {
//                System.out.println(user);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

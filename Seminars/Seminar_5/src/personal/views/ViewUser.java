package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public static int saveFormat;

    

    

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;
        setSaveFormat();
        
        
        
        while (true) {
            String command = prompt("Введите команду: ");
                
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        listUsers();    
                        break;
                    case UPDATE:
                        listUsers();
                        updateUser();
                        break;
                    case DELETE:
                        listUsers();
                        deletUser();
                        listUsers();
                        break;
                    case EXIT:
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void setSaveFormat() {  
        ViewUser.saveFormat = Integer.parseInt(prompt("Выберите формат сохранения (1 - через ','; 2 - через ';'): "));
    }

    private void listUsers() {
        for (User User : userController.readAllUsers()) {
            System.out.println();
            System.out.println(User);
        }
    }

    private void readUser() throws Exception{
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println(user);
    }

    private void createUser() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void updateUser() throws Exception{
        String userId = prompt("Введите ID: ");
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.updateUser(userId, new User(firstName, lastName, phone));
    }

    private void deletUser() throws Exception{
        String userId = prompt("Введите ID: ");
        userController.deleteUser(userId);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        
    }
}

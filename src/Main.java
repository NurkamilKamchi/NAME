import dao.DaoAnnouncementImpl;
import dao.DaoUserImpl;
import database.Database;
import enumm.Role;
import models.Announcement;
import models.User;
import service.UserServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database dataBase = new Database();
        UserServiceImpl userService = new UserServiceImpl(new DaoUserImpl(dataBase));

        Scanner scanner =new Scanner(System.in);

        DaoAnnouncementImpl daoAnnouncement = new DaoAnnouncementImpl(dataBase);
        while (true){
            System.out.println("""
                    1.add 
                    2.remove
                    3.getAll
                    4.Add user.
                    5.Get all users.
                    6.Update user.
                    7.Delete user.
                    
                    """);
            switch (scanner.nextLine()){
                case "1"-> {
                    Scanner scanner3 = new Scanner(System.in);
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scanner2 = new Scanner(System.in);

                    Announcement announcement = new Announcement();
                    System.out.println("Enter id of product: ");
                    Long id = scanner1.nextLong();
                    announcement.setId(id);
                    System.out.println("Enter name of product: ");
                    String name = scanner3.nextLine();
                    announcement.setName(name);
                    System.out.println("Enter description of product: ");
                    String desc = scanner3.nextLine();
                    announcement.setDescription(desc);
                    System.out.println("Enter price of product: ");
                    double price = scanner2.nextDouble();
                    announcement.setPrice(price);
                    System.out.println("Enter name of owner: ");
                    String nameOwner = scanner3.nextLine();
                    announcement.setOwner(nameOwner);

                    daoAnnouncement.add(announcement);
                }
                case "2"-> {
                    System.out.println("Enter id of product for remove: ");
                    Long id = scanner.nextLong();
                    daoAnnouncement.removeById(id);
                }
                case "3"->{
                    System.out.println(daoAnnouncement.getAll());
                }
                case "4"->{
                    User user =new User("Nurkamil",1L, Role.USER,"n@gmail.com","1234");
                    System.out.println(userService.addUser(user));
                }case "5"->{
                    System.out.println(userService.getAllUsers());
                }case "6"->{
                    User user = new User("Myrzaiym",2L,Role.USER,"m@gmail.com","4321");
                    System.out.println(userService.updateUserById(1L, user));
                }case "7"->{
                    System.out.println(userService.deleteUserById(1L));
                }
            }
        }
    }
}

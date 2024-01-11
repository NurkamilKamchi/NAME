import dao.DaoAnnouncementImpl;
import database.Database;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database dataBase = new Database();
        Scanner scanner =new Scanner(System.in);

        DaoAnnouncementImpl daoAnnouncement = new DaoAnnouncementImpl(dataBase);
        while (true){
            System.out.println("""
                    1.add
                    2.remove
                    3.getAll
                    """);
            switch (scanner.nextLine()){
                case "1"-> {
                    daoAnnouncement.add();
                }
                case "2"-> {
                    System.out.println("Enter id of product for remove: ");
                    Long id = scanner.nextLong();
                    daoAnnouncement.removeById(id);
                }
                case "3"->{
                    System.out.println(daoAnnouncement.getAll());
                }
            }
        }
    }
}

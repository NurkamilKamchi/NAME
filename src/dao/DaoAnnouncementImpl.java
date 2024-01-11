package dao;

import database.Database;
import models.Announcement;

import java.util.List;
import java.util.Scanner;

public class DaoAnnouncementImpl implements DaoInterface {
    private final Database dataBase;

    public DaoAnnouncementImpl(Database dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Announcement announcement = new Announcement();
        System.out.println("Enter id of product: ");
        Long id = scanner1.nextLong();
        announcement.setId(id);
        System.out.println("Enter name of product: ");
        String name = scanner.nextLine();
        announcement.setName(name);
        System.out.println("Enter description of product: ");
        String desc = scanner.nextLine();
        announcement.setDescription(desc);
        System.out.println("Enter price of product: ");
        double price = scanner2.nextDouble();
        announcement.setPrice(price);
        System.out.println("Enter name of owner: ");
        String nameOwner = scanner.nextLine();
        announcement.setOwner(nameOwner);
        dataBase.announcementList.add(announcement);
        System.out.println("Successfully added!");

    }

    @Override
    public String removeById(Long Id) {
        dataBase.announcementList.removeIf(announcement -> announcement.getId().equals(Id));
        return "Successfully";
    }

    @Override
    public List<Announcement> getAll() {
        return dataBase.announcementList;
    }
}

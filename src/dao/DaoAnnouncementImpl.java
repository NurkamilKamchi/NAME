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
    public String add(Announcement announcement) {
        dataBase.announcementList.add(announcement);
        return "Successfully added!";

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

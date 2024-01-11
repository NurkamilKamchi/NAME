package dao;

import models.Announcement;

import java.util.List;

public interface DaoInterface {
    String add (Announcement announcement);
    String removeById(Long Id);
    List<Announcement> getAll();
}

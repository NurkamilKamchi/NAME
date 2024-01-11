package dao;

import models.Announcement;

import java.util.List;

public interface DaoInterface {
    void add ();
    String removeById(Long Id);
    List<Announcement> getAll();
}

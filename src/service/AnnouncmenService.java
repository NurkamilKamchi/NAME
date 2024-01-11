package service;

import models.Announcement;

import java.util.List;

public interface AnnouncmenService {
    void add (Announcement announcement);
    String removeById(Long Id);
    List<Announcement> getAll();
}

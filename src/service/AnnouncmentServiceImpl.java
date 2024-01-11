package service;

import dao.DaoAnnouncementImpl;
import models.Announcement;

import java.util.List;

public class AnnouncmentServiceImpl implements AnnouncmenService{
    private final DaoAnnouncementImpl daoAnnouncement;

    public AnnouncmentServiceImpl(DaoAnnouncementImpl daoAnnouncement) {
        this.daoAnnouncement = daoAnnouncement;
    }

    @Override
    public void add(Announcement announcement) {
        daoAnnouncement.add(announcement);
    }

    @Override
    public String removeById(Long Id) {
        daoAnnouncement.removeById(Id);
        return "Success deleted!";
    }

    @Override
    public List<Announcement> getAll() {
        return null;
    }
}

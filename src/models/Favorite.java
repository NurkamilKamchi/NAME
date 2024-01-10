package models;

import java.util.ArrayList;
import java.util.List;

public class Favorite {
    private Long id;
    private User user;
    private List<Announcement> announcements= new ArrayList<>();
}

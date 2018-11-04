package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(2014445, "szyszuniapol", 'M', LocalDate.of(1980, 7, 14), 12));
        forumUsersList.add(new ForumUser(1457645, "1983bartekwro", 'M', LocalDate.of(1985, 12, 11), 7));
        forumUsersList.add(new ForumUser(2254711, "25Bonaparte", 'M', LocalDate.of(1991, 3, 4), 3));
        forumUsersList.add(new ForumUser(0247751, "6misiek", 'M', LocalDate.of(1989, 11, 1), 16));
        forumUsersList.add(new ForumUser(2255471, "wielka", 'F', LocalDate.of(1994, 2, 28), 21));

    }

    public List<ForumUser> getForumUsersList(){
        return new ArrayList<>(forumUsersList);
    }
}






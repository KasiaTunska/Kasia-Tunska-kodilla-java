package com.kodilla.stream.forumuser;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Bartek Pierwszy", 'M', 2010, 9, 23,23));
        userList.add(new ForumUser(2, "Antoni Drugi", 'M',1997, 1, 1,4));
        userList.add(new ForumUser(3, "Karolina Trzecia", 'F', 2007, 1, 1, 3));
        userList.add(new ForumUser(4, "Ola Czwarta", 'F', 1980, 1, 1, 4));
        userList.add(new ForumUser(5, "Olek Piąty" , 'M',2000,3,3,2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
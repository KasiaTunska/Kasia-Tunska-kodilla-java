package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(final int userID, final String userName, char userSex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getUserID() {

        return userID;
    }

    public String getUserName() {

        return userName;
    }

    public char getUserSex() {

        return userSex;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public int getPostsNumber() {

        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + userSex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        return userID == forumUser.userID;
    }

    @Override
    public int hashCode() {
        return userID;
    }
}


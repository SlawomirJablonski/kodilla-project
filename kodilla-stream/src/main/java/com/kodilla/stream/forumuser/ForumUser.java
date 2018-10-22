package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {

    private final int userId;
    private final String userNick;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postNumber;

    public ForumUser(int userId, String userNick, char sex, LocalDate dateOfBirth, int postNumber) {
        this.userId = userId;
        this.userNick = userNick;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postNumber = postNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userNick='" + userNick + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postNumber=" + postNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        if (sex != forumUser.sex) return false;
        if (postNumber != forumUser.postNumber) return false;
        if (!userNick.equals(forumUser.userNick)) return false;
        return dateOfBirth.equals(forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + userNick.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + postNumber;
        return result;
    }
}

package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double userAveragePostsQuantity;
    double userAverageCommentsQuantity;
    double averageCommentsQuantityPerPost;

    public int getUsersNumber() {
        return usersQuantity;
    }

    public int getPostsNumber() {
        return postsQuantity;
    }

    public int getCommentsNumber() {
        return commentsQuantity;
    }

    public double getUserAveragePostsNumber() {
        return userAveragePostsQuantity;
    }

    public double getUserAverageCommentsNumber() {
        return userAverageCommentsQuantity;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsQuantityPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        this.userAveragePostsQuantity = postsQuantity / usersQuantity;
        this.userAverageCommentsQuantity = commentsQuantity / usersQuantity;
        this.averageCommentsQuantityPerPost = commentsQuantity / postsQuantity;
    }
}

package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double userAveragePostsQuantity;
    private double userAverageCommentsQuantity;
    private double averageCommentsQuantityPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getUserAveragePostsQuantity(){
        return userAveragePostsQuantity;
    }

    public double getUserAverageCommentsQuantity(){
        return userAverageCommentsQuantity;
    }

    public double getAverageCommentsQuantityPerPost(){
        return averageCommentsQuantityPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        if(usersQuantity>0) {
            this.userAveragePostsQuantity = postsQuantity / usersQuantity;
        }
        if (usersQuantity>0) {
            this.userAverageCommentsQuantity = commentsQuantity / usersQuantity;
        }
        if (postsQuantity>0) {
            this.averageCommentsQuantityPerPost = commentsQuantity / postsQuantity;
        }
    }
}

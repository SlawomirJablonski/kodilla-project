package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsForU100P0C0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        int usersQuantity =100;
        List<String> listOfUsersNames = generateUserNames(usersQuantity);
        int postsQuantity =0;
        int commentsQuantity =0;

        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100,statisticsCalculator.getUsersQuantity());
        assertEquals(0,statisticsCalculator.getPostsQuantity());
        assertEquals(0,statisticsCalculator.getCommentsQuantity());
        assertEquals(0, statisticsCalculator.getUserAveragePostsQuantity(), 0);
        assertEquals(0, statisticsCalculator.getUserAverageCommentsQuantity(), 0);
        assertEquals(0, statisticsCalculator.getAverageCommentsQuantityPerPost(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsFor0U1000P900C() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        int usersQuantity = 0;
        List<String> listOfUsersNames = generateUserNames(usersQuantity);
        int postsQuantity = 1000;
        int commentsQuantity = 900;

        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculator.getUsersQuantity());
        assertEquals(1000, statisticsCalculator.getPostsQuantity());
        assertEquals(900, statisticsCalculator.getCommentsQuantity());
        assertEquals(0, statisticsCalculator.getUserAveragePostsQuantity(), 0);
        assertEquals(0, statisticsCalculator.getUserAverageCommentsQuantity(), 0);
        assertEquals(900/1000, statisticsCalculator.getAverageCommentsQuantityPerPost(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsForU100P1000C1500() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        int usersQuantity = 100;
        List<String> listOfUsersNames = generateUserNames(usersQuantity);
        int postsQuantity = 1000;
        int commentsQuantity = 1500;

        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100,statisticsCalculator.getUsersQuantity());
        assertEquals(1000,statisticsCalculator.getPostsQuantity());
        assertEquals(1500,statisticsCalculator.getCommentsQuantity());
        assertEquals(1000/100, statisticsCalculator.getUserAveragePostsQuantity(), 0);
        assertEquals(1500/100, statisticsCalculator.getUserAverageCommentsQuantity(), 0);
        assertEquals(1500/1000, statisticsCalculator.getAverageCommentsQuantityPerPost(), 0);
    }

    public List<String> generateUserNames(int n){
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            list.add(String.valueOf(random.nextInt(10000) - 1000));
        }
        return list;
    }
}
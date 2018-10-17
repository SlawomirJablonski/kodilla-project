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
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        int usersQuantity = 100;
        List<String> listOfUsersNames = makeList(usersQuantity);
        int postsQuantity = 0;
        int commentsQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100,statisticsCalculator.getUsersQuantity());
        assertEquals(0,statisticsCalculator.getPostsQuantity());
        assertEquals(0,statisticsCalculator.getCommentsQuantity());
        if (usersQuantity>0) {
            assertEquals(postsQuantity / usersQuantity, statisticsCalculator.getUserAveragePostsQuantity(), 0);
        }
        if (usersQuantity>0) {
            assertEquals(commentsQuantity / usersQuantity, statisticsCalculator.getUserAverageCommentsQuantity(), 0);
        }
        if (postsQuantity>0) {
            assertEquals(commentsQuantity / postsQuantity, statisticsCalculator.getAverageCommentsQuantityPerPost(), 0);
        }
    }
    public List<String> makeList(int n){
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            list.add(String.valueOf(random.nextInt(10000) - 1000));
        }
        return list;
    }
}
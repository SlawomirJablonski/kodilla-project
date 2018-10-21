package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int usersQuantity = 100;
        int postsQuantity = 1000;
        int commentsQuantity = 0;
    }
}
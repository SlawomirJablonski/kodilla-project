package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            System.out.println(secondChallenge.probablyIWillThrowException(1.1, 1.6));

        } catch (SecondChallengeException e) {

            System.out.println(e.getMessage());

        }
    }
}
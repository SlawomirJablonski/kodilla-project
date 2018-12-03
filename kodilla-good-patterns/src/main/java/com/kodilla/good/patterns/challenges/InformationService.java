package com.kodilla.good.patterns.challenges;

public class InformationService {
    public void inform(final User user){
        System.out.println("Dear"+user.getName()+" "+user.getSurname()+", thank You for shopping in our marketplace");
    }
}

package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean
    public Board getBoard(){
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }

    @Bean
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean
    public TaskList getInProgressList(){
        return new TaskList();
    }

    @Bean
    public TaskList getDoneList(){
        return new TaskList();
    }
}

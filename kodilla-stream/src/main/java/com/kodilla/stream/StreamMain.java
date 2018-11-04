package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        //przypadek 0
        System.out.println("Welcome to module 7 - Stream");
        //przypadek 1 - stworzenie obiektu z metodą
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        //przypadek 2 - interfejs Executor, implementacja interfejsu w klasie ExecuteSaySomething
        //klsa processor z metodą ktora w argumencie przyjmuje obiekt klasy implementującej intf. Executor
        //ciało metody w processor: obiektImplemInterfExecutor.metodaZinterfejsu();
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        //przypdek 3 lambdy
        Processor processor1 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor1.execute(codeToExecute);

        //chodzi w tym o to ze do zmiennej mozna przypisac juz kod i potem taką zmienną wpakować do
        //metody jako argument
        //tej zmiennej nwt nie trzeba tworzyć, wystarczy zapis
        //processor1.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

String a = "nnnnnndndndndn";
        char[] array = a.toCharArray();
        System.out.println(array);
    }
}
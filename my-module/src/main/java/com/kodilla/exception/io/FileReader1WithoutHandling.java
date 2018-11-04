package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader1WithoutHandling {
    public void readFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //Path path = Paths.get(file.getPath());


        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {

            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            System.out.println("problem..."+e);

        } finally {

            System.out.println("do it always");

        }

        //System.out.println(file.getPath());
    }
}
//Path path = Paths.get("files/test.txt");
//file.getPath()

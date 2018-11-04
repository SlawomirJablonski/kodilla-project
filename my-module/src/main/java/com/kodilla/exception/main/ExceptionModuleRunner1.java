package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader1;
import com.kodilla.exception.io.FileReader1Exception;


public class ExceptionModuleRunner1 {
    public static void main(String[] args){
        FileReader1 file1Reader = new FileReader1();

        try {
            file1Reader.readFile();
        } catch (FileReader1Exception e){
            System.out.println("Problem while reading a file");
        }
    }
}

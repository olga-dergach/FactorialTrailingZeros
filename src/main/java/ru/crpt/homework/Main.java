package ru.crpt.homework;

import ru.crpt.homework.func.FactorialImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FactorialCmdExecutor executor = new FactorialCmdExecutor(new FactorialImpl());
        ExecResult result = executor.execute(args);
        System.out.println(result.getMessage());
        if (!result.isSuccess()) {
            System.exit(1);
        }
    }
}

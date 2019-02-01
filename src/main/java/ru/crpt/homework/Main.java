package ru.crpt.homework;

import ru.crpt.homework.func.FactorialImpl;

import java.util.Scanner;

/**
 * Main класс консольного приложения.
 * Считывает введённое пользователем число и выводит в консоль количество нулей на конце факториала этого числа.
 *
 * @author Дергач О.В.
 * @version 1.0
 */

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

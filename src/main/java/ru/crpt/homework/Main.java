package ru.crpt.homework;

import ru.crpt.homework.func.FactorialImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        FactorialImpl func = new FactorialImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println(func.getNumberOfTrailingZeros(sc.nextInt()));

    }
}

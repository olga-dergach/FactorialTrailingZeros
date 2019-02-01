package ru.crpt.homework.func;

public class FactorialImpl implements Factorial {
    public int getNumberOfTrailingZeros(int inputNumber){

        if (inputNumber < 0) throw new IllegalArgumentException("Value should be positive");

        int countOf2 = 0;
        int countOf5 = 0;

        for (int i = 1; i <= inputNumber; i++){
            if (i % 2 == 0) countOf2++;
            if (i % 5 == 0) countOf5++;
        }

        return Math.min(countOf2, countOf5);
    }
}

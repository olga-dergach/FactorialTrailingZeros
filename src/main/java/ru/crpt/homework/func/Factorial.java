package ru.crpt.homework.func;

/**
 * Итерфейс описывающий доступные методы для факториала.
 *
 * @author Дергач О.В.
 * @version 1.0
 */

public interface Factorial {
    /**
     * Метод возвращает количество нулей, на которые заканчивается факториал числа.
     * @param inputNumber - целое натуральное число в диапазоне от 0 до Integer.MAX_VALUE
     * @return число конечных нулей
     * @exception IllegalArgumentException если inputNumber < 0
     */
    int getNumberOfTrailingZeros(int inputNumber);
}

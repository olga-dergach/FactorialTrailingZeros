package ru.crpt.homework;

/**
 * Класс с параметрами результата вызова функции консольного приложения
 *
 * @author Дергач О.В.
 * @version 1.0
 */
public class ExecResult {
    private final boolean success;
    private final String message;

    public ExecResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}

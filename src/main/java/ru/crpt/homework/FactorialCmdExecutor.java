package ru.crpt.homework;

import ru.crpt.homework.func.Factorial;

/**
 * Класс для обработки входных данных. Возвращает объект ExecResult с результатом выполнения вычислений
 * и сообщением в случае ошибки
 *
 * @author Дергач О.В.
 * @version 1.0
 */
public class FactorialCmdExecutor {
    public static final String WRONG_ARGS_COUNT_MSG = "Wrong number of arguments.";
    public static final String WRONG_ARGS_MSG = "Wrong argument. Should be a number between 0 and " + Integer.MAX_VALUE;
    private final Factorial func;

    public FactorialCmdExecutor(Factorial func) {
        this.func = func;
    }

    public ExecResult execute(String[] cmdArgs) {
        if (cmdArgs.length != 1) {
            return new ExecResult(false, WRONG_ARGS_COUNT_MSG);
        } else {
            try {
                int intInput = Integer.parseInt(cmdArgs[0].trim());
                int result = func.getNumberOfTrailingZeros(intInput);
                return new ExecResult(true, String.valueOf(result));
            } catch (IllegalArgumentException ex) {
                return new ExecResult(false, WRONG_ARGS_MSG);
            }
        }
    }
}

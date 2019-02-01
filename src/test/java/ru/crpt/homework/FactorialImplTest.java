package ru.crpt.homework;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.crpt.homework.func.FactorialImpl;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;
import static ru.crpt.homework.FactorialCmdExecutor.WRONG_ARGS_COUNT_MSG;
import static ru.crpt.homework.FactorialCmdExecutor.WRONG_ARGS_MSG;

/**
 * Параметризованный тест для FactorialCmdExecutor
 *
 * @author Дергач О.В.
 * @version 1.0
 */

@RunWith(Parameterized.class)
public class FactorialImplTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new String[] {}, false, Matchers.equalTo(WRONG_ARGS_COUNT_MSG)},
                {new String[] {"-1", "1"}, false, Matchers.equalTo(WRONG_ARGS_COUNT_MSG)},
                {new String[] {"-1"}, false, Matchers.equalTo(WRONG_ARGS_MSG)},
                {new String[] {"err"}, false, Matchers.equalTo(WRONG_ARGS_MSG)},
                {new String[] {Long.MAX_VALUE+""}, false, Matchers.equalTo(WRONG_ARGS_MSG)},
                {new String[] {"  0  "}, true, Matchers.equalTo("0")},
                {new String[] {"0"}, true, Matchers.equalTo("0")},
                {new String[] {"1"}, true, Matchers.equalTo("0")},
                {new String[] {"2"}, true, Matchers.equalTo("0")},
                {new String[] {"5"}, true, Matchers.equalTo("1")},
                {new String[] {"17"}, true, Matchers.equalTo("3")},
                {new String[] {"22"}, true, Matchers.equalTo("4")}
        });
    }

    @Parameterized.Parameter
    public String[] args;

    @Parameterized.Parameter(1)
    public boolean expectedStatus;

    @Parameterized.Parameter(2)
    public Matcher messageMatcher;

    private FactorialCmdExecutor executor = new FactorialCmdExecutor(new FactorialImpl());

    @Test
    public void testCorrectCountOfZeros() {
        ExecResult result = executor.execute(args);
        Assert.assertEquals(expectedStatus, result.isSuccess());
        assertThat(result.getMessage(), messageMatcher);
    }
}

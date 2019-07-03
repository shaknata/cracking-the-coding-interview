package chapter1problem6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static chapter1problem6.StringCompressor.stringCompress;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class StringCompressorTest {

    private static Object[][] strings() {
        return new Object[][]{
                {"aфффsssssdood", "a1ф3s5d1o2d1"},
                {"cccccc", "c6"},
                {"a", "a"},
                {"", ""},
                {"asd", "asd"},  // результат длиннее инпута, возвращаем инпут
                {"abbb", "abbb"},  // результат равен по длине инпуту, возвращаем инпут
                {"     ", " 5"},
                {"as asssssssssss", "a1s1 1a1s11"},
        };
    }

    @ParameterizedTest(name = "Строки - {0} и {1}")
    @MethodSource("strings")
    void test(String input, String result){
        assertThat(stringCompress(input),equalTo(result));
    }

}

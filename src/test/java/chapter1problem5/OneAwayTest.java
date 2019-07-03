package chapter1problem5;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static chapter1problem5.OneAway.checkEdit;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class OneAwayTest {


    private static Object[][] strings() {
        return new Object[][]{
                {"asd", "asd", true},
                {"asd", "as", true},
                {"adf", "asdf", true},
                {"asdf", "sdf", true},
                {"", "", true},
                {"", "q", true},
                {"asdf", "awdf", true},
                {"asdf", "ssdf", true},
                {"asdf", "asdd", true},
                {"Plp", "plp", true},
                {"POlp", "polp", false},
                {"asdf", "qsdfg", false},
                {"asdf", "sd", false},
                {"", "ss", false},
                {"asd", "dsa",false},
        };
    }

    @ParameterizedTest(name = "Строки - {0} и {1}")
    @MethodSource("strings")
    void test(String s1, String s2, boolean result) {
        MatcherAssert.assertThat(checkEdit(s1, s2), equalTo(result));
    }

}

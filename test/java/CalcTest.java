import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTest {
    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSub() {
        Assertions.assertEquals(3, calculator.sub(5, 2));
    }

    @Test
    public void testMul() {
        Assertions.assertEquals(9, calculator.mul(3, 3));
    }

    @Test
    public void testDiv() {
        Assertions.assertEquals(1, calculator.div(2, 2));
    }
/*
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "7, 5, 12",
            "12, 12, 24"
    })
    @ParametrizedTest
    public void massTestAdd(int a, int b, int result) {
        Assertions.assertEquals(result, calculator.add(a, b));
    }

 */
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayTest {
    private ArrayParser ArrParr;

    @BeforeEach
    public void init() {
        ArrParr = new ArrayParser();
    }

    /*  Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
    */
    public static Stream<Arguments> inFirst() {
        List<Arguments> out = new ArrayList<>();
        int[][] a1 = {{1, 2, 4, 4, 2, 3, 4, 1, 7},
                {1, 2, 4, 4, 2, 2, 3, 4, 7},
                {1, 2, 1, 1, 1, 4, 1, 1, 7},
                {1, 2, 5, 5, 4, 3, 1, 1, 7}};
        int[][] a2 = {{1, 7}, {7}, {1, 1, 7}, {3, 1, 1, 7}};
        for (int i = 0; i < 4; i++) {
            out.add(Arguments.arguments(a1[i], a2[i]));
        }
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("inFirst")
    public void testFirst(int[] a1, int[] a2) throws BadFormat {
        Assertions.assertArrayEquals(a2, ArrParr.first(a1));

    }

    /*  Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false
    */
    public static Stream<Arguments> inSecond() {
        List<Arguments> out = new ArrayList<>();
        int[][] a1 = {{1, 1, 1, 4, 4, 1, 4, 4},
                {1, 1, 1, 1, 1, 1},
                {4, 4, 4, 4},
                {1, 4, 4, 1, 1, 4, 3}};
        boolean[] a2 = {true, false,false,false};
        for (int i = 0; i < 4; i++) {
            out.add(Arguments.arguments(a1[i],a2[i]));
        }
        return out.stream();
    }
    @ParameterizedTest
    @MethodSource("inSecond")
    public void testSecond(int[] a1, boolean a2) {
        Assertions.assertEquals(a2, ArrParr.second(a1));
    }
}

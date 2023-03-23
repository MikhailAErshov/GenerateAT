import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateAutoTestsTest {

    @Test
    void testGetSumPositiveNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getSumNumbers(6, 2);
        Assertions.assertEquals(8, result);
    }

    @Test
    void testGetSumNegativeNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getSumNumbers(-5, -8);
        Assertions.assertEquals(-13, result);
    }

    @Test
    void testGetDiffPositiveNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getDiffNumbers(4, 9);
        Assertions.assertEquals(-5, result);
    }

    @Test
    void testGetDiffNegativeNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getDiffNumbers(-1, -7);
        Assertions.assertEquals(6, result);
    }

    @Test
    void testGetMultiplyPositiveNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getMultiplyNumbers(5, 10);
        Assertions.assertEquals(50, result);
    }

    @Test
    void testGetMultiplyPositiveByZeroNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        int result = GenerateAutoTests.getMultiplyNumbers(6, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testGetDevidePositiveNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        double result = GenerateAutoTests.getDevideNumbers(6, 4);
        Assertions.assertEquals(1.5, result);
    }

    @Test
    void testGetDevideNegativeNumbers() {
        GenerateAutoTests generateAutoTests = new GenerateAutoTests();
        double result = GenerateAutoTests.getDevideNumbers(-9,-4 );
        Assertions.assertEquals(2.25, result);
    }

    @Test
    void testGetDevideNegativeByZeroNumbers() {
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, GenerateAutoTests.getDevideNumbers(-7, 0));
    }

    @Test
    void testGetDevideZeroByZeroNumbers() {
        Assertions.assertEquals(Double.NaN, GenerateAutoTests.getDevideNumbers(0, 0));
    }
}

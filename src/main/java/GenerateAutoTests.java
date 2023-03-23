public class GenerateAutoTests {

    private int numberOne;
    private int numberTwo;

    public static int getSumNumbers(int numberOne, int numberTwo) {
        var result = numberOne + numberTwo;
        System.out.println("Результат: ");
        return result;
    }

    public static int getDiffNumbers(int numberOne, int numberTwo) {
        var result = numberOne - numberTwo;
        System.out.println("Результат: ");
        return result;
    }

    public static int getMultiplyNumbers(int numberOne, int numberTwo) {
        var result = numberOne * numberTwo;
        System.out.println("Результат: ");
        return result;
    }

    public static double getDevideNumbers(double numberOne, double numberTwo) {
        var result = numberOne / numberTwo;
        System.out.println("Результат: ");
        return result;
    }
}

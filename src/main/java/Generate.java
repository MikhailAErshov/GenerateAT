import java.util.Scanner;

public class Generate {
    public static void main(String[] args) {
        int operation;
        int num1;
        int num2;
        System.out.println("Выберите арифметическую операцию: \n1. Сложение \n2. Вычитание \n3. Умножение \n4. Деление ");
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextInt();
        System.out.println("Введите первое число ");
        num1 = scanner.nextInt();
        System.out.println("Введите второе число ");
        num2 = scanner.nextInt();
        switch (operation) {
            case 1 -> GenerateAutoTests.getSumNumbers(num1, num2);
            case 2 -> GenerateAutoTests.getDiffNumbers(num1, num2);
            case 3 -> GenerateAutoTests.getMultiplyNumbers(num1, num2);
            case 4 -> GenerateAutoTests.getDevideNumbers(num1, num2);
            default -> System.out.println("Такой операции не задано");
        }

    }
}

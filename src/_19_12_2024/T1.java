package _19_12_2024;

public class T1 {
    /**
     * 1. Напишите метод, который принимает два целых числа и возвращает их сумму.
     */
    public static int add(int a, int b) {

        return a + b;
    }

    /**
     * 2. Напишите метод, который принимает два числа и возвращает их разность.
     */
    public static int subtract(int a, int b) {
        return a - b;

    }

    /**
     * 3. Напишите метод, который принимает два числа и возвращает их произведение.
     */
    public static int multiply(int a, int b) {
        // TODO: реализовать метод
        return a * b;
    }

    /**
     * 4. Напишите метод, который принимает два числа и возвращает их частное.
     */
    public static double divide(int a, int b) {
        // TODO: реализовать метод (не забудьте учесть деление на ноль)
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }

    /**
     * 5. Напишите метод, который принимает число и возвращает его квадрат.
     */
    public static int square(int a) {
        // TODO: реализовать метод
        return a * a;
    }

    /**
     * 6. Напишите метод, который принимает три числа и возвращает их среднее арифметическое.
     */
    public static double average(int a, int b, int c) {
        // TODO: реализовать метод
        return (a + b + c) / 3.0;
    }

    /**
     * 7. Напишите метод, который принимает два числа и возвращает остаток от их деления.
     */
    public static int modulus(int a, int b) {
        // TODO: реализовать метод
        return a % b;
    }

    /**
     * 8. Напишите метод, который принимает два числа и возвращает большее из них.
     */
    public static int max(int a, int b) {
        // TODO: реализовать метод
        return (a > b? a : b); // или Math.max(a, b)
    }

    /**
     * 9. Напишите метод, который принимает два числа и возвращает меньшее из них.
     */
    public static int min(int a, int b) {
        // TODO: реализовать метод
        return (a < b? a : b); // или Math.min(a, b)

    }

    /**
     * 10. Напишите метод, который принимает число и проверяет, является ли оно четным.
     * Возвращает true, если число четное, и false, если нечетное.
     */
    public static boolean isEven(int a) {
        // TODO: реализовать метод
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
        // System.out.println(add(3, 5));
    }
}
package _19_12_2024;

import java.util.Arrays;

public class T2 {
    /**
     * 11. Напишите метод, который принимает массив чисел и возвращает их сумму.
     */
    public static int sumArray(int[] numbers) {
        // TODO: реализовать метод
        int sumArray = Arrays.stream(numbers).sum();
        return sumArray;
    }


    /**
     * 12. Напишите метод, который принимает два числа и возводит первое в степень второго.
     */
    public static double power(int base, int exponent) {
        // TODO: реализовать метод
        return Math.pow(base, exponent);
    }


    /**
     * 13. Напишите метод, который проверяет, является ли число простым.
     */
    public static boolean isPrime(int number) {
        // TODO: реализовать метод
        if (number <= 1) {
        }
        return false;
    }

    /**
     * 14. Напишите метод, который принимает два числа и возвращает их наибольший общий делитель (НОД).
     */
    public static int gcd(int a, int b) {
        // TODO: реализовать метод

        return (a < b ? b : gcd(b, a % b));
    }

    /**
     * 15. Напишите метод, который принимает массив чисел и возвращает его максимальный элемент.
     */
    public static int maxInArray(int[] numbers) {
        // TODO: реализовать метод
        numbers = new int[]{5, 3, 8, 1, 4};
        int maxValue = maxInArray(numbers);
        System.out.println("" + maxValue);
        return maxInArray(numbers);
    }

    /**
     * 16. Напишите метод, который принимает массив чисел и возвращает его минимальный элемент.
     */
    public static int minInArray(int[] numbers) {
        // TODO: реализовать метод
        numbers = new int[]{5, 3, 8, 1, 4};
        int minValue = minInArray(numbers);
        System.out.println("" + minValue);
        return minInArray(numbers);
    }


    /**
     * 17. Напишите метод, который проверяет, является ли число палиндромом
     * (одинаково читается слева направо и справа налево).
     */
    public static boolean isPalindrome(int number) {
        // TODO: реализовать метод
        String str = Integer.toString(number);

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    /**
     * 18. Напишите метод, который возвращает n-ое число Фибоначчи.
     */
    public static int fibonacci(int n) {
        // TODO: реализовать метод
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }


/**
 * 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
 */
public static int[] sortArray(int[] numbers) {
    // TODO: реализовать метод
    numbers = new int[]{5, 3, 8, 1, 4};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    return new int[0];
}

/**
 * 20. Напишите метод, который принимает два числа и возвращает их наименьшее общее кратное (НОК).
 */
public static int lcm(int a, int b) {
    // TODO: реализовать метод
    return (a * b) / gcd(a, b);
}

public static void main(String[] args) {
    // Пример вызовов методов (после их реализации)
    // System.out.println(add(3, 5));
}
}


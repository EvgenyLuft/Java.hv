package _05_12_2024;

import _09_12_2024.Employee1;

public class ArrayTasksWithStringsAndInts {

    private static Employee1 Arrays;

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};

    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};

    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};

    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        String allWords = array[0];

        for (int i = 1; i < array.length; i++) {
            allWords += array[i];
        }

        System.out.println("allWords = " + allWords);

        boolean isUnique = true;
        int countUniqueLetters = 0;
        for (int i = 0; i < allWords.length(); i++) {
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                countUniqueLetters++;
            }
            isUnique = true;
        }

        String[] arrayUniqueLetters = new String[countUniqueLetters];
        int k = 0;
        for (int i = 0; i < allWords.length(); i++) {
            isUnique = true;
            for (int j = 1; i >= j; j++) {
                if (allWords.charAt(i) == allWords.charAt(i-j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                arrayUniqueLetters[k] = String.valueOf(allWords.charAt(i));
                k++;
            }
        }
        System.out.println("arrayUniqueLetters = " + java.util.Arrays.toString(arrayUniqueLetters));
    }


}

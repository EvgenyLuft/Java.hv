package _03_12_2024;

public class ArrayTasksExpended {
    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};

    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};

    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};

    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};

    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
            System.out.println(count);
        }
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};

    }

    // 8. Посчитать количество четных элементов.
//    public static void task8() {
//        int[] array = {4, -2, 0, 7};
//        String[] array = {"cat", "elephant", "dog"};
//        String min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (min.length() > array[i].length()) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//    }

    // 9. Посчитать количество нечетных элементов.
//    public static void task9() {
//        int[] array = {4, -2, 0, 7};
//        int[] array = {1, 2, 3, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;

    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};

    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};

    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
//    public static void task13() {
//        int[] array = {1, 2, 3, 4};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > array[i + 1]) {
//                System.out.println("Не упорядочен");
//            } else {
//                System.out.println("Упорядочен");
//            }
//        }
//    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, 2, 3, 4};

    }

    // 15. Переставить элементы массива в обратном порядке.
//    public static void task15() {
//        int[] array = {1, 2, 3, 4};
//        int temp;
//        for (int i = 0; i < array.length / 2; i++) {
//            temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//    }
}

package com.app._03_12_2024;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int a = i + 1; a < array.length; a++) {
                if (array[i] + array[a] == target) {
                    System.out.println("ffff");
                }

            }
        }

        // 17. Проверить, есть ли в массиве дубликаты.
        public static void task17 () {
            int[] array = {1, 2, 3, 4, 2};
            boolean hasDuplicates = false;
            for (int i = 0; i + array.length; i++) {
                for (int a = i + 1; a < array.length; a++) {
                    if (array[i] == array[a]) {

                        hasDuplicates = true;
                    }

                    if (hasDuplicates) {
                        System.out.println("Array has duplicates");
                    } else {
                        System.out.println("Array does not have duplicates");
                    }
                }


            }

            // 18. Удалить все нули из массива и сдвинуть элементы влево.
            public static void task18 () {
                int[] array = {0, 1, 0, 3, 0};
                int index = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i]) ! = 0 {
                        array[index] = array[i];
                        index++;
                    }
                }

                for (int i = index; i < array.length; i++) {
                    array[i] = 0;
                }

                System.out.println("Original" + array.toString());
                System.out.println("zeros" + array.toString());
            }
        }

    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30};
        int divisor = 5;

        int count = 0;
        for (int num : array) {
            if (num % divisor == 0) {
                count++;
            }
        }

        System.out.println("The number" + divisor + "remainder" + count);
    }
}

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};


        Arrays.sort(array);

        System.out.println("Array: " + Arrays.toString(array));

    }






// 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        int index =


    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

    }

    public static void main(String[] args) {
    }
}
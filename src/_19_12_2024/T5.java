package _19_12_2024;

import java.util.HashSet;
import java.util.Set;

public class T5 {


    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает все подмассивы длиной 2.
     */
    public static int[][] generateSubArrays(int[] array) {
        // TODO: реализовать метод
        if (array.length < 2) {
            return new int[0][0];
        }
        int n = array.length;
        int[][] subArrays = new int[n - 1][2];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            subArrays[index][0] = array[i];
            subArrays[index][1] = array[i + 1];
            index++;
        }
        return subArrays;
    }


    /**
     * 2. Напишите метод, который принимает массив целых чисел и возвращает true, если массив является палиндромом.
     */
    public static boolean isArrayPalindrome(int[] array) {
        // TODO: реализовать метод
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает самый часто встречающийся элемент.
     */
    public static int findMostFrequentElement(int[] array) {
        // TODO: реализовать метод
        if (array.length == 0) {
            return 0;
        }
        int maxCount = 0;
        int mostFrequentElement = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = array[i];
            }
        }
        return maxCount;
    }


    /**
     * 4. Напишите метод, который принимает массив целых чисел и
     * сортирует его без использования встроенных методов сортировки.
     */
    public static int[] sortArrayManually(int[] array) {
        // TODO: реализовать метод
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и
     * переставляет элементы массива в случайном порядке.
     */
    public static int[] shuffleArray(int[] array) {
        // TODO: реализовать метод
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * n);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    /**
     * 6. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив с уникальными элементами.
     */
    public static int[] removeDuplicates(int[] array) {
        // TODO: реализовать метод

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }


    /**
     * 7. Напишите метод, который принимает массив целых
     * чисел и возвращает его циклически сдвинутым вправо на k позиций.
     */
    public static int[] rotateArrayRight(int[] array, int k) {
        // TODO: реализовать метод
        if (array == null || array.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = array.length;
        k = k % n;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = array[i];
        }
        return rotatedArray;
    }

    /**
     * 8. Напишите метод, который принимает два массива
     * целых чисел и возвращает их пересечение.
     */
    public static int[] findArrayIntersection(int[] array1, int[] array2) {
        // TODO: реализовать метод
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> intersection = new HashSet<Integer>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        int[] intersectionArray = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            intersectionArray[index++] = num;
        }
        return intersectionArray;
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если в массиве есть дублирующиеся элементы.
     */
    public static boolean hasDuplicates(int[] array) {
        // TODO: реализовать метод
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает максимальную сумму подмассива (алгоритм Кадане).
     */
    public static int maxSubarraySum(int[] array) {
        // TODO: реализовать метод
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : array) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
        // int[] exampleArray = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.deepToString(generateSubArrays(exampleArray)));
    }
}
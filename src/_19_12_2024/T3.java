package _19_12_2024;

public class T3 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает его длину.
     */
    public static int getArrayLength(int[] array) {
        // TODO: реализовать метод
        array = new int[]{1, 2, 3, 4, 5};
        int[] result = new int[array.length];

        return result.length;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и выводит его элементы в консоль.
     */
    public static void printArray(int[] array) {
        // TODO: реализовать метод
        array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает сумму его элементов.
     */
    public static int sumArrayElements(int[] array) {
        // TODO: реализовать метод
        array = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * 4. Напишите метод, который принимает массив целых чисел и возвращает максимальный элемент.
     */
    public static int findMaxElement(int[] array) {
        // TODO: реализовать метод
        array = new int[]{1, 2, 3, 4, 5};
        int MaxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > MaxElement) {
                MaxElement = array[i];
            }
        }
        return MaxElement;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и возвращает минимальный элемент.
     */
    public static int findMinElement(int[] array) {
        // TODO: реализовать метод
        array = new int[]{1, 2, 3, 4, 5};
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает
     * новый массив, содержащий только чётные элементы.
     */
    public static int[] filterEvenNumbers(int[] array) {
        // TODO: реализовать метод
        int[] numbers = {1, 2, 3, 4, 5};
        int[] evenNumbers = filterEvenNumbers(numbers);
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        return evenNumbers;
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и
     * возвращает массив в обратном порядке.
     */
    public static int[] reverseArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }


    /**
     * 8. Напишите метод, который принимает массив целых чисел и возвращает true,
     * если массив отсортирован по возрастанию.
     */
    public static boolean isArraySorted(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 9. Напишите метод, который принимает массив целых чисел и возвращает
     * среднее арифметическое его элементов.
     */
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            int sum = 0;

            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;

        }
    }


        /**
         * 10. Напишите метод, который принимает массив целых чисел и
         * возвращает количество чётных чисел в массиве.
         */
        public static int countEvenNumbers ( int[] array){
            int count = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

}






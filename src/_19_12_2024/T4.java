package _19_12_2024;

public class T4 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
     */
    public static int[] doubleArrayElements(int[] array) {
        // TODO: реализовать метод
        // Проверяем, если массив пустой или равен null, то возвращаем пустой массив
        if (array == null) {
            return new int[0];
        }

        // Создаём новый массив той же длины, что и исходный
        int[] doubledArray = new int[array.length];

        // Проходим по всем элементам массива и удваиваем каждый
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i] * 2;
        }

        // Возвращаем новый массив с удвоенными элементами
        return doubledArray;
    }

}

/**
 * 2. Напишите метод, который принимает массив целых чисел и
 * возвращает массив только с положительными числами.
 */
public static int[] filterPositiveNumbers(int[] array) {
    // TODO: реализовать метод

    // Проверка на null и пустоту массива
    if (array == null) {
        return new int[0];
    }
    ArrayList<Integer> positiveNumbersList = new ArrayList<>();
    for (int num : array)
        if (num > 0) {
            positiveNumbersList.add(num);
        }

    int[] positiveNumbersArray = new int[positiveNumbersList.size()];
    for (int i = 0; i < positiveNumbersList.size(); i++) {
        positiveNumbersArray[i] = positiveNumbersList.get(i);
    }

    return positiveNumbersArray;
}

/**
 * 3. Напишите метод, который принимает два массива
 * целых чисел и возвращает их объединение.
 */
public static int[] mergeArrays(int[] array1, int[] array2) {
    // TODO: реализовать метод
    if (array1.length != array2.length) {
        return new int[0];
    }
    int[] mergedArray = new int[array1.length + array2.length];
    System.arraycopy(array1, 0, mergedArray, 0, array1.length);
    System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
    return mergedArray;

}

/**
 * 4. Напишите метод, который принимает массив целых
 * чисел и возвращает количество уникальных элементов.
 */
public static int countUniqueElements(int[] array) {
    // TODO: реализовать метод
    if (array.length == 0) {
        return 0;
    }
    Set<Integer> uniqueElements = new HashSet<>();
    for (int num : array) {
        uniqueElements.add(num);
    }
    return uniqueElements.size();
}


/**
 * 5. Напишите метод, который принимает массив целых
 * чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
 */
public static int[] squareArrayElements ( int[] array){
    // TODO: реализовать метод
    if (array.length == 0){
        return new int[0];
    }
    int[] squaredArray = new int[array.length];
    for (int i = 0; i < array.length; i++){
        squaredArray[i] = array[i] * array[i];
    }
    return squaredArray;
}

/**
 * 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
 */
public static int findSecondLargest ( int[] array){
    // TODO: реализовать метод
    if (array.length < 2){
        return Integer.MIN_VALUE;
    }
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int num : array){
        if (num > max){
            secondMax = max;
            max = num;
        } else if (num > secondMax && num < max){
            secondMax = num;
        }
    }
    if (secondMax == Integer.MIN_VALUE){
        return max;
    }
    return secondMax;

}

/**
 * 7. Напишите метод, который принимает массив целых чисел и
 * возвращает true, если массив содержит заданное число.
 */
public static boolean containsNumber ( int[] array, int number){
    // TODO: реализовать метод
    for (int value : array )
        if (number == 0 || number == 1) {
            return false;
        }
    for (int num : array){
        if (num == number){
            return true;
        }
    }
    return false;
}

/**
 * 8. Напишите метод, который принимает массив целых чисел
 * и заменяет все отрицательные числа на 0.
 */
public static int[] replaceNegativesWithZero ( int[] array){
    // TODO: реализовать метод
    for (int i = 0; i < array.length; i++){
        if (array[i] < 0){
            array[i] = 0;
        }
    }
    return array;
}

/**
 * 9. Напишите метод, который принимает массив целых
 * чисел и возвращает индекс первого вхождения заданного числа.
 */
public static int findFirstIndex ( int[] array, int number){
    // TODO: реализовать метод
    for (int i = 0; i < array.length; i++){
        if (array[i] == number){
            return i;
        }
    }
    return -1;
}

/**
 * 10. Напишите метод, который принимает массив целых ч
 * исел и возвращает true, если в массиве нет повторяющихся элементов.
 */
public static boolean hasNoDuplicates ( int[] array){
    // TODO: реализовать метод
    for(int i=0; i < array.length; i++){
        for(int j=i+1; j < array.length; j++){
            if(array[i] == array[j]){
                return false;
            }
        }
    }
    return true;
}

public static void main (String[]args){
    // Пример вызовов методов (после их реализации)
    // int[] exampleArray = {1, -2, 3, 4, -5};
    // System.out.println(Arrays.toString(doubleArrayElements(exampleArray)));
}

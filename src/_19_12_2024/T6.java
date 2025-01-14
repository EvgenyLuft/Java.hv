package _19_12_2024;

public class T6 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает его длину.
     */
    public static int getArrayLength(String[] array) {
        // TODO: реализовать метод
        return array.length;
    }


    /**
     * 2. Напишите метод, который принимает массив строк и выводит его элементы в консоль.
     */
    public static void printArray(String[] array) {
        // TODO: реализовать метод
        array = new String[]{"Hello", "World", "Java"};
        for (String str : array) {
            System.out.println(str);
        }
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает первую строку.
     */
    public static String getFirstElement(String[] array) {
        // TODO: реализовать метод
        array = new String[]{"Hello", "World", "Java"};
        return array[0];
    }

    /**
     * 4. Напишите метод, который принимает массив строк и возвращает последнюю строку.
     */
    public static String getLastElement(String[] array) {
        // TODO: реализовать метод
        array = new String[]{"Hello", "World", "Java"};
        return array[array.length - 1];
    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке.
     */
    public static String[] reverseArray(String[] array) {
        // TODO: реализовать метод
        array = new String[]{"Hello", "World", "Java"};
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }

    /**
     * 6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки.
     */
    public static int getLongestStringLength(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxLength = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
            }
        }
        return maxLength;
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной.
     */
    public static String getLongestString(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return null;
        }

        String longestString = "";
        for (String str : array) {
            if (str != null && str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку.
     */
    public static boolean containsString(String[] array, String target) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return false;
        }
        for (String str : array) {
            if (str!= null && str.equals(target)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы.
     */
    public static int countStringsStartingWith(String[] array, char letter) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return 0;
        }
        int count = 0;
        for (String str : array) {
            if (str!= null && str.charAt(0) == letter) {
                count++;
            }
        }
        return count;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре.
     */
    public static String[] convertToUpperCase(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return new String[0];
        }
        String[] upperCaseArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            upperCaseArray[i] = array[i].toUpperCase();
        }
        return upperCaseArray;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
        // String[] exampleArray = {"apple", "banana", "cherry"};
        // System.out.println(getArrayLength(exampleArray));
    }
}

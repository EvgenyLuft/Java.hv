package _19_12_2024;

import java.lang.reflect.Array;
import java.util.*;

import static _19_12_2024.T2.isPalindrome;

public class T7 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке.
     */
    public static String[] sortArray(String[] array) {
        // TODO: реализовать метод
        if (array.length == 0 || array.length == 0) {
            return array;
        }
        String[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;

    }

    /**
     * 2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку.
     */
    public static String findMostFrequentString(String[] array) {
        // TODO: реализовать метод
        if (array.length == 0) {
            return "";
        }
        int maxCount = 0;
        String mostFrequentString = array[0];
        for (String str : array) {
            int count = 0;
            for (String str2 : array) {
                if (str.equals(str2)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentString = str;
            }
        }
        return mostFrequentString;
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк.
     */
    public static String[] getUniqueStrings(String[] array) {
        // TODO: реализовать метод
        if (array.length == 0) {
            return new String[0];
        }
        HashSet<String> uniqueSet = new HashSet<>();
        ArrayList<String> uniqueList = new ArrayList<>();

        for (String str : array) {
            if (uniqueSet.add(str)) {
                uniqueList.add(str);
            }
        }
        return uniqueList.toArray(new String[0]);
    }

    /**
     * 4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах.
     */
    public static String[] findCommonStrings(String[] array1, String[] array2) {
        // TODO: реализовать метод
        ArrayList<String> commonList = new ArrayList<>();
        for (String str1 : array1) {
            for (String str2 : array2) {
                if (str1.equals(str2)) {
                    commonList.add(str1);
                }
            }
        }
        return commonList.toArray(new String[0]);

    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами.
     */
    public static String[] findPalindromes(String[] array) {
        // TODO: реализовать метод
        if (array.length == 0 || array.length == 0) {
            return array;
        }
        ArrayList<String> palindromeList = new ArrayList<>();
        for (String str : array) {
            if (isPalindrome(Integer.parseInt(str))) {
                palindromeList.add(str);
            }
        }
        return palindromeList.toArray(new String[0]);
    }

    /**
     * 6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово.
     */
    public static String[] removeStringsContainingWord(String[] array, String word) {
        // TODO: реализовать метод
        if (array.length == 0) {
            return new String[0];
        }
        ArrayList<String> filteredList = new ArrayList<>();
        for (String str : array) {
            if (!str.contains(word)) {
                filteredList.add(str);
            }
        }
        return filteredList.toArray(new String[0]);
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных.
     */
    public static String findStringWithMostVowels(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return null;
        }
        String vowels = "aeiouAEIOU";
        String stringWithMostVowels = "";
        int maxVowelCount = 0;

        for (String str : array) {
            if (str != null) {
                int currentVowelCount = 0;
                for (char c : str.toCharArray()) {
                    if (vowels.indexOf(c) != -1) {
                        currentVowelCount++;
                    }
                }

                if (currentVowelCount > maxVowelCount) {
                    maxVowelCount = currentVowelCount;
                    stringWithMostVowels = str;
                }
            }
        }

        return stringWithMostVowels;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает массив строк, содержащих только буквы (без цифр или специальных символов).
     */
    public static String[] filterAlphabeticStrings(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return new String[0];
        }

        ArrayList<String> resultList = new ArrayList<>();

        for (String str : array) {
            if (str != null && str.matches("[a-zA-Z]+")) {
                resultList.add(str);
            }
        }
        return resultList.toArray(new String[0]);
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает массив строк, где каждая строка перевернута (reverse).
     */
    public static String[] reverseEachString(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return new String[0];
        }
        ArrayList<String> reversedList = new ArrayList<>();
        for (String str : array) {
            StringBuilder sb = new StringBuilder(str);
            reversedList.add(sb.reverse().toString());
        }
        return reversedList.toArray(new String[0]);
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк, сгруппированных по их длине (каждая группа отдельный элемент массива).
     */
    public static String[][]  groupStringsByLength(String[] array) {
        // TODO: реализовать метод
        if (array == null || array.length == 0) {
            return new String[0][0];
        }
        HashMap<Integer, ArrayList<String>> lengthMap = new HashMap<>();

        for (String str : array) {
            if (str != null) {
                int length = str.length();
                lengthMap.putIfAbsent(length, new ArrayList<>());
                lengthMap.get(length).add(str);
            }
        }

        String[][] result = new String[lengthMap.size()][];
        int index = 0;

        for (ArrayList<String> group : lengthMap.values()) {
            result[index++] = group.toArray(new String[0]);
        }

        return result ;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
        // String[] exampleArray = {"apple", "banana", "radar", "123", "level"};
        // System.out.println(Arrays.toString(sortArray(exampleArray)));
    }
}

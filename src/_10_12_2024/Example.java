package _10_12_2024;

import java.util.Random;

public class Example {
    public static void get(int x) {

    }

    public static char sum() {
        char[] chars = {'a', 'b'};
        return chars[new Random().nextInt(chars.length-1)];
    }

    public static void main(String[] args) {
        get(9);
    }
}

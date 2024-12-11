package _09_12_2024;

import java.util.Random;

public class generateObjects {
    ublic CustomObject[]_09_12_2024.CustomObject[] generateObjects() {
        CustomObject[] objects = new CustomObject[20];
        Random random = new Random();

        for (int i = 0; i < objects.length; i++) {
            int id = i + 1;
            double value = random.nextDouble() * 100;
            boolean isActive = random.nextBoolean();
            char symbol = (char) (random.nextInt(26) + 'A');
            double weight = 1.0 + (random.nextDouble() * (50.0 - 1.0));
            int age = random.nextInt(128);
            double level = random.nextDouble() * 32767;

            objects[i] = new CustomObject(id, value, isActive, symbol, weight, age, level);
        }


        return objects;
    }
}

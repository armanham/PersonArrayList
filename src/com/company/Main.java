package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> human = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Person person = new Person(generateRandomString(6), calculateAge(generateRandomDataOfBirth()));
            human.add(person);
            System.out.println((i + 1) + ". Name: " + human.get(i).getName() + " --- Age: " + human.get(i).getAge());
        }
    }

    private static String generateRandomString(int size) {
        Random random = new Random();
        String defaultString = "";
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(25) + 97;
            char symbol = (char) number;
            if (i == 0) {
                String s = String.valueOf(symbol).toUpperCase();
                defaultString += s;
            } else {
                defaultString += symbol;
            }
        }
        return defaultString;
    }

    private static int generateRandomDataOfBirth() {
        Random random = new Random();
        int anyDataOfBirth = random.nextInt(70) + 1950;
        return anyDataOfBirth;
    }

    private static int calculateAge(int dataOfBirth) {
        int age = 2021 - dataOfBirth;
        return age;
    }
}

package org.example;

import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = getPersonName(scanner);
        System.out.println("Введите рост (число с запятой):");
        float height = getPersonHeight(scanner);
        System.out.println("Введите рост (целое число):");
        int age = getPersonAge(scanner);
        scanner.close();
        System.out.println("Человека зовут " + name + ", ростом " + height + " и лет ему " + age);
    }

    private static int getPersonAge(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Введите пожалуйста число с запятой");
            }

        }
    }

    private static float getPersonHeight(Scanner scanner) {
        while (true) {
            try {
                return Float.parseFloat(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Введите пожалуйста число с запятой");
            }

        }
    }

    private static String getPersonName(Scanner scanner) {
        return scanner.next();
    }


}

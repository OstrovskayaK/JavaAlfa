package ru.alfabank.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");

        // try catch finally  ВАЛИДАЦИИ
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("VALIDATION");
            scanner.next();
            a = scanner.nextInt();
        } finally {
            scanner.close();
         //   System.out.println("good job");
        }


        System.out.println("enter b");
        int b = scanner.nextInt();

        float res = a / (float) b;
        System.out.println(res);

    }

}

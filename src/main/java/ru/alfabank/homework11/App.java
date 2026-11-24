package ru.alfabank.homework11;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter water level");
            int water = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error. Enter number.");
        }

        try {
            coffeeMachine.makeCoffee(100);
        } catch (NotEnoughWaterExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Check is complete");
        }

        try {
            coffeeMachine.calculateCups(1000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error. Capsize cannot be equal to 0.");
        }

        try {
            String sort = null;
            coffeeMachine.printCoffeeName(sort);
        } catch (NullPointerException e) {
            System.out.println("Coffee name is missing.");
        }
    }
}

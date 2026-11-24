package ru.alfabank.homework11;

public class CoffeeMachine {

    public void makeCoffee(int waterLevel) {
        if (waterLevel<200) {
            throw new NotEnoughWaterExeption("Please, add more water!");
        }
        System.out.println("Enjoy Your Coffee!");
    }

   public void calculateCups(int waterLevel, int capsCapacity) {
        int numberOfCups = waterLevel / capsCapacity;
       System.out.println("You can get " + numberOfCups + " cups of coffee");
   }
   public void printCoffeeName(String coffeeName) {
       System.out.println(coffeeName.toUpperCase());
   }
}

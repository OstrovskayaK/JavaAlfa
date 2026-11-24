package ru.alfabank.homework13;

import java.util.ArrayList;
import java.util.Objects;



public class Alien {

     String name;
    String planet;
    int dangerLevel;

    public Alien(String name, String planet, int dangerLevel) {
        this.name = name;
        this.planet = planet;
        this.dangerLevel = dangerLevel;
    }

    public static void main(String[] args) {
        ArrayList<Alien> alienArmy = new ArrayList<>();

        alienArmy.add(new Alien("Yjjgjhg", "HD 10180 g", 7));
        alienArmy.add(new Alien("Ujh", "HD 69830 g", 1));
        alienArmy.add(new Alien("Yjjgjhg", "HD 10180 g", 9));
        alienArmy.add(new Alien("Oleg", "Mars-2", 3));
        alienArmy.add(new Alien("Ktulkhu", "Zott", 7));

        for (Alien alien : alienArmy) {
            System.out.println(alien);
        }

    }
//    @Override
//    public boolean equals(){
//
//        return Objects.equals(name, alien.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet);
    }
    @Override
    public String toString() {
        return name + "  " + planet + "  " + dangerLevel;
    }



}

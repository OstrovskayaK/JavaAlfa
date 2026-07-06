package ru.alfabank.homework7.arena.heroes;

public class Archer extends Hero{

    public int arrowsCount;

    public Archer(String name, int level, int health, int arrowsCount) {
        super(name, level, health);
        this.arrowsCount = arrowsCount;
    }

    @Override
    public void attack(){
        super.attack();
        System.out.println("Archer shoots!");
    }

}

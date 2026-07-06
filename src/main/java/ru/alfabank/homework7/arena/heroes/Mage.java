package ru.alfabank.homework7.arena.heroes;

public class Mage extends Hero{
    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana = mana;
    }


    @Override
    public void attack(){
        super.attack();
        System.out.println("FIREBALL!!!");
    }

}

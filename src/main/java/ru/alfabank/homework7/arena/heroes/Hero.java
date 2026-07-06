package ru.alfabank.homework7.arena.heroes;

public class Hero {

    private String name;
    private int level;
    private int health;
    final static int MAX_LEVEL = 100;
    static int heroesCreated = 0;


    public Hero (String name, int level, int health) {
       this.name = name;
       this.level = level;
       this.health = health;

       heroesCreated++;
    }

    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Level:" + level);
        System.out.println("Health:" + health);
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            return;
        }
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
        }
    }

    public void attack() {
        System.out.println("Deals a normal blow");
    }

    public void attack(String target) {
        System.out.println("Hero attacks target " + target);
    }

    public void attack(String target, int times) {
        System.out.printf("Hero attacks target %s for %d times", target, times);
    }

    public final void rest(){
        System.out.println("Hero rests");
    }

}

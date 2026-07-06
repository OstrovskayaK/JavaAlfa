package ru.alfabank.homework7.arena.heroes;

public class Knight extends Hero {
    int armor;

    public Knight(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor = armor;
    }


    @Override
    public void attack(){
    super.attack();
    System.out.println("Strikes with a sword!");
}
//@Override
//    public void rest(){
//    super.rest();
//    System.out.println("Рыцарь уснул на коне");
//}

}

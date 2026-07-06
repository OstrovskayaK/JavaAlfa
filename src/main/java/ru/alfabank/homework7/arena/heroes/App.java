package ru.alfabank.homework7.arena.heroes;

public class App {

    static void main() {

        //массив героев
        Archer archer1 = new Archer("Amia", 99, 120, 1);
        Knight knight1 = new Knight("Zigfrid", 19, 11, 9);
        Mage mage1 = new Mage("Nyarlatkhotep", 999, 200, 1000);

        Hero[] heroes = {archer1, knight1, mage1};

        // вызываем методы
        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
        }


        final Knight knight = new Knight("Evlampy", 1, 1, 1);

    }
}

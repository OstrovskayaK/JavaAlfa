package ru.alfabank.homework3;

public class Password {

    public static void main() {
        String[] arrayOfPasswords = {"jhgDF87qnmkji889", "qwertyhgF123456", "PAmPaPam69"};

        String pwd0 = arrayOfPasswords[0];
        String pwd1 = arrayOfPasswords[1];
        String pwd2 = arrayOfPasswords[2];

        boolean passwordCheck0 = pwd0.length() > 8 && !pwd0.startsWith("1") && !pwd0.contains("qwerty") && !pwd0.contains("1234") && !pwd0.endsWith("z");
        boolean passwordCheck1 = pwd1.length() > 8 && !pwd1.startsWith("1") && !pwd1.contains("qwerty") && !pwd1.contains("1234") && !pwd1.endsWith("z");
        boolean passwordCheck2 = pwd2.length() > 8 && !pwd2.startsWith("1") && !pwd2.contains("qwerty") && !pwd2.contains("1234") && !pwd2.endsWith("z");

        System.out.printf("Parol %s proshel proverky - %s%n", pwd0, passwordCheck0);
        System.out.printf("Parol %s proshel proverky - %s%n", pwd1, passwordCheck1);
        System.out.printf("Parol %s proshel proverky - %s%n", pwd2, passwordCheck2);

    }
}

package ru.alfabank.homework9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;

public class LogoGen {
    static String VariantesOfNames[] = {"Singh", "Kumar", "Reddy", "Patel", "Sharma"};
    static Random random = new Random();

    public static String RandomName(String[] VariantesOfNames) {
        int index = random.nextInt(VariantesOfNames.length);
        return VariantesOfNames[index];
    }

    public static void main() throws IOException {

        Faker faker = new Faker();

        System.out.println(FigletFont.convertOneLine(RandomName(VariantesOfNames)));
        System.out.println(FigletFont.convertOneLine("&"));
        System.out.println(FigletFont.convertOneLine(faker.name().lastName()));

        System.out.println(faker.name().fullName());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.address());

    }


}

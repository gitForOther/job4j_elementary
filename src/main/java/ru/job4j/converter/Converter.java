package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {

        float in = 140;
        float expected = 2;

        float out = Converter.rubleToEuro(in);
        System.out.println("140 rubles are " + out + " euro.");

        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        expected = 2.3333333f;

        out = Converter.rubleToDollar(in);
        System.out.println("140 rubles are " + out + " dollars.");

        passed = expected == out;
        System.out.println("140 rubles are 2.3333333 dollars. Test result : " + passed);

    }

}

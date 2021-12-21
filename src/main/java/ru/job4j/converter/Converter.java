package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float expected2 = 2.3333333f;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2.3333 Test result : " + passed2);

    }
}


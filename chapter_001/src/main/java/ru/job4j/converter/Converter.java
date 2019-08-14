package ru.job4j.converter;

public class Converter {
    int euros = 70;
    int dollars = 60;

    public double rubleToEuro(double valueRubles) {
        return valueRubles / this.euros;
    }

    public double rubleToDollar(double valueRubles) {
        return valueRubles / this.dollars;
    }

    public double euroToRuble(double valueEuros) {
        return valueEuros * this.euros;
    }

    public double dollarToRuble(double valueDollars) {
        return valueDollars * this.dollars;
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
//        System.out.println("140 rubles are " + converter.rubleToEuro(140) + " euro.");
//        System.out.println("140 rubles are " + converter.rubleToDollar(140) + " dollars.");
//        System.out.println("140 euros are " + converter.euroToRuble(140) + " rubles.");
//        System.out.println("140 dollars are " + converter.dollarToRuble(140) + " rubles.");

        // test rubleToEuro
        double in = 140;
        double expected = 2;
        double out = converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        // test rubleToDollar
        in = 120;
        expected = 2;
        out = converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);

        // test euroToRuble
        in = 2;
        expected = 140;
        out = converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euros are 140. Test result : " + passed);

        // test dollarToRuble
        in = 2;
        expected = 120;
        out = converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120. Test result : " + passed);
    }
}



public class Calculations {
    public double a, b, c;

    static double valueNumerator(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c));
    }

    static double valuefraction(double a, double b, double c) {
        return valueNumerator(a, b, c) / 2 * a;
    }

    static double valueThirdParth(double a, double b, double c) {
        return Math.pow(a, 3) * c;
    }

    static double valueForthParth(double a, double b, double c) {
        return Math.pow(b, -2);
    }

    static double volueOfFormula(double a, double b, double c) {
        return valuefraction(a, b, c) - valueThirdParth(a, b, c) + valueForthParth(a, b, c);
    }
}

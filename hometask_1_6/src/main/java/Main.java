public class Main {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double[] abc = {a, b, c};
            System.out.println(sum(abc[0], abc[1], abc[2]));
        } catch (Exception e) {
            System.out.println("Can't convert string to number.");
        }
    }

    public static double sum(double a, double b, double c) {
        double max = a;
        double min = a;
        if (b > a & b >= c) {
            max = b;
        } else {
            max = c;
        }
        if (b < a & b <= c) {
            min = b;
        } else {
            min = c;
        }
        return max + min;
    }
}
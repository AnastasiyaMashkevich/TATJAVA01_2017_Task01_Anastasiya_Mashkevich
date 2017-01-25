
public class Decision {
    double a = 0;
    double b = 0;
    double c = 0;
    double p, s;

    public void triangle(double a, double b, double c) {
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        p = a + b + c;
        s = (a * b) / 2;
        System.out.println("Периметр треугольника равна " + p + " Площадь треугольника равна " + s);

    }
}

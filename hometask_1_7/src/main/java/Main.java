
public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 12;
        double h = 1;
        print(createTable(a, b, h));
    }

    public static double function(double x) {
        return (Math.pow(Math.sin(x), 2)) - (Math.cos(2 * x));
    }

    public static void print(double[][] r) {
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(r[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] createTable (double a, double b, double h) {
        int numberOfLine = (int) ((b - a) / h + 1);
        double[][] resultTable = new double[numberOfLine][2];
        for (int i = 0; i < numberOfLine; i++) {
            resultTable[i][0] = a;
            resultTable[i][1] = function(a);
            a+=h;
        }
            return resultTable;

    }

}




    public class Main {
        public static void main(String[] args) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                double[] abc = {a, b, c};
                for (double d : abc){
                    System.out.println(degrees(d));
                }
            } catch (Exception e){
                System.out.println("Can't convert string to number.");
            }
        }
        public static double degrees(double a){
            if (a >=0){
                return Math.pow(a, 2);
            } else {
                return Math.pow(a, 4);
            }
        }
    }
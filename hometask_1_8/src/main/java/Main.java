

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int k = 5;
        int[] array = new int[n];
       for (int i=0; i<array.length;i++) {
           array[i]=  (int) (Math.random()*120);
       }
        System.out.println(sum (array,k));


    }

    public static int sum(int[] mass, double k) {
        int resuls = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % k == 0) {
                resuls += mass[i];


            }
        }
        return resuls;
    }
}
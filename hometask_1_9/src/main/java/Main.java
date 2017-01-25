
public class Main {
    public static void main(String[] args) {
        int length1 = 15;
        int length2 = 7;
        int k = 5;
        int[] array1 = new int[length1 + length2];
        int[] array2 = new int[length2];

        for (int i = 0; i < length1; i++) {
            array1[i] = (int) (Math.random() * 99);
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 99);
            System.out.print(array2[i] + " ");
        }
        System.out.println("");

        uniteArray1(array1, array2, k);
        for (int in : array1) {
            System.out.print(in + " ");
            }
        }
        public static int[] uniteArray1 ( int[] array1, int[] array2, int k){
            for (int i = array1.length - 1; i > k + array2.length; i--) {
                array1[i] = array1[i - array2.length];
            }
            for (int i = k + 1; i <= k + array2.length; i++) {
                array1[i] = array2[i - (k+1)];
            }
            return array1;
        }

    }





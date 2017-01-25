
public class Main {
    public static void main(String[] args) {
        int n = 6;

        for (int[] in : createTable(n)) {
            for (int i : in) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] createTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = j +1 ;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    table[i][j] = n - j;
                }
            }
        }
        return table;

    }
}
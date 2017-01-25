
public class Sum {
    public boolean sumOfNumber(int x) {
        if (x < 999 || x > 10000) {
            return false;
        }
        String str = String.valueOf(x);
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(0)+str.charAt(1)==str.charAt(2)+str.charAt(3)) {
                return true;
            }
        }
        return false;
    }
}
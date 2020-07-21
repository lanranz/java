public class Multiplication {
    static int multiply(int n1, int n2) {
        int temp = 0;
        if (n1 == 0) {
            return 0;
        } else if (n1 > 0) {
            for (int i = 1; i <= n1; i++) {
                temp += n2;
            }
            return temp;
        } else {
            for (int i = 1; i <= -n1; i++) {
                temp += n2;
            }
            return -temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(multiply(-5, -6));
    }
}

package club.banyuan.output;


public class StaticDemo {

    int num1 = 3;
    static int num2 = 5;

    StaticDemo(int num1, int num2) {

        if (num2 < 30) {
            this.num2 = num2;
        }
        num1 = num1;
    }

    public static void main(String args[]) {

        StaticDemo s1 = new StaticDemo(9, 10);
        StaticDemo s2 = new StaticDemo(12, 22);

        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);

    }
}


package club.banyuan.output;


public class StaticDemo {

    static int x = 10;

    public static void main(String[] args) {
        System.out.println(StaticDemo.x);
    }

    static {
        int x = 20;
        System.out.print(x + " ");
    }
}


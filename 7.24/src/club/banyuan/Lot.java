package club.banyuan;

import java.util.Random;
import java.util.Scanner;

public class Lot {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = random.nextInt(100);
            if (a < 5) {
                System.out.println("大吉");
            } else if (a < 15) {
                System.out.println("中吉");
            } else if (a < 30) {
                System.out.println("小吉");
            } else if (a < 60) {
                System.out.println("吉");
            } else if (a < 80) {
                System.out.println("末吉");
            } else if (a < 95) {
                System.out.println("凶");
            } else {
                System.out.println("大凶");
            }
            String next = scanner.next();
            if(Integer.parseInt(next)==0){
                break;
            }
        }
    }
}

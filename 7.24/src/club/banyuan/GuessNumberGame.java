package club.banyuan;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while (scanner.hasNext()) {
        System.out.println("请选择难度等级\n" +
                "1. 0~9\n" +
                "2. 0~99\n" +
                "3. 0~999\n" +
                "0. 退出");

            switch (scanner.nextInt()){
                case 1:
                    int random1 = random.nextInt(100);
                    System.out.println("你当前选择的难度等级0~9\n" +
                            "请输入想要猜的次数，0返回上一级\n" +
                            "你的输入：");
                    int times = scanner.nextInt();
                    System.out.println(times);
                    System.out.println("现在开始猜数");
                    System.out.print("剩余次数"+times+"，请输入数字：");
                    int a = scanner.nextInt();
                    System.out.println(a);
                    if(a>random1) {
                        System.out.println("输入的是" + a + "，没有猜中，猜大了");
                        times--;
                    }else if(a<random1){
                        System.out.println("输入的是" + a + "，没有猜中，猜小了");
                        times--;
                    }else {
                        System.out.println("输入的是" + a + "，恭喜你，猜中了");
                        System.out.println("是否继续，1.继续, 0. 退出");
                        int b =scanner.nextInt();
                        if(b==1){
                            continue;
                        }else if(b==0){
                            return;
                        }
                    }
            }
        }


    }


}

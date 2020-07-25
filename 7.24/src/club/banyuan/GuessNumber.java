package club.banyuan;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int count = 4;
        String str = "";
        for (int i = 0; i < count; i++) {
            int a = (int) (Math.random() * 10);
            if (str.contains(String.valueOf(a))) {
                count++;
                continue;
            }
            str += String.valueOf(a);
        }
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入四位数字：");
        String in = null;
        while (scanner.hasNext()) {
            in = scanner.nextLine();
            char[] chars = in.toCharArray();
            int containsCounts = 0;
            String a = "";
            for (int i = 0; i < 4; i++) {
                String s = String.valueOf(chars[i]);
                if (str.contains(s)) {
                    containsCounts++;
                    a += String.valueOf(i);
                }
            }
            System.out.println("包含了" + containsCounts + "个正确的数字");
            int locationCounts = 0;
            if (a != null) {
                char[] chars1 = a.toCharArray();
                char[] chars2 = str.toCharArray();
                for (int j = 0; j < 4; j++) {
                    if (chars2[chars1[j]] == chars[chars1[j]]) {
                        locationCounts++;
                    }
                }
                if (locationCounts == 4) {
                    System.out.println("回答正确");
                    return;
                } else {
                    System.out.println(locationCounts + "个数字位置正确");
                }
            } else {
                System.out.println("0个数字位置正确");
            }
        }
    }
}

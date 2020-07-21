import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        while (true){
            System.out.println("要进行哪种运算？\n"+ "1.加法\n"+ "2.减法\n"+ "3.乘法\n"+"4.除法\n"+"5.取余\n"+"6.退出");
            int input = scanInt("请输入:");
            System.out.println("输入的内容:"+input);
            switch (input){
                case 1:
                    int a = scanInt("请输入第一个操作数:");
                    System.out.println(a);
                    int b = scanInt("请输入第二个操作数:");
                    System.out.println(b);
                    System.out.println(a+"+"+ b+"="+(a+b));
                    break;
                case 2:
                    int c = scanInt("请输入第一个操作数:");
                    System.out.println(c);
                    int d = scanInt("请输入第二个操作数:");
                    System.out.println(d);
                    System.out.println(c+"-"+d+"="+(c-d));
                    break;
                case 3:
                    int e = scanInt("请输入第一个操作数:");
                    System.out.println(e);
                    int f = scanInt("请输入第二个操作数:");
                    System.out.println(f);
                    System.out.println(e+"-"+f+"="+(e*f));
                    break;
                case 4:
                    int g = scanInt("请输入第一个操作数:");
                    System.out.println(g);
                    int h = scanInt("请输入第二个操作数:");
                    System.out.println(h);
                    System.out.println(g+"*"+h+"="+(g*h));
                    break;
                case 5:
                    int i = scanInt("请输入第一个操作数:");
                    System.out.println(i);
                    int j = scanInt("请输入第二个操作数:");
                    System.out.println(j);
                    System.out.println(i+"%"+j+"="+(i%j));
                    break;
                case 6:
                    System.out.println("程序退出，谢谢使用");
                    return;
                default:
                    System.out.println("输入不合法");
                    break;
            }
        }

    }

    public static  int scanInt(String msg){
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("输入不合法，请重新输入！");
            return scanInt(msg);
        }
    }
}


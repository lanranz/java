import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        if(args.length<=0||args.length>3){
            System.out.println("输入不合法"+ Arrays.toString(args));
            return;
        }
    }
}
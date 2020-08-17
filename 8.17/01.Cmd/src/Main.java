import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("命令错误");
        }
        switch (args[0]) {
            case "ls":
                ls(args);
                break;
            case "cp":
                cp(args);
                break;
            case "rm":
                break;
            default:
                System.out.println("命令错误");
        }

    }


    private static void cp(String[] args) {
        if(args.length!=3){
            System.out.println("参数不合法");
        }


    }

    public static void ls(String[] args) {
        if (args.length == 1) {
            printDir(".");
        } else if (args.length == 2) {
            printDir(args[1]);
        } else if(args.length == 3 && args[2].equals("-l")) {
            printDir(args[1]);
        }
    }

    public static void printDir(String path) {
        File file = new File(path);
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("路径参数错误");
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.toPath());
        }
    }
}

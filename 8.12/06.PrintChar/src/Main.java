public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintChar printChar = new PrintChar();
        PrintNum printNum = new PrintNum();

        printNum.start();
        printChar.start();

        printNum.join();
        printChar.join();
    }
}

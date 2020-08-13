public class Q3 extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("A ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Q3 obj = new Q3();
        obj.run();
        obj.start();
    }
}
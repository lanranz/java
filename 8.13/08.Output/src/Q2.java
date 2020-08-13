public class Q2 implements Runnable
{
    public void run()
    {
        System.out.printf("A ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Q2());
        thread1.start();
        thread1.start();
        System.out.println(thread1.getState());
    }
}
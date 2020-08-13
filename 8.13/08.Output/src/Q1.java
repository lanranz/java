public class Q1 implements Runnable
{
    public void run()
    {
        System.out.printf("A ");
        System.out.printf("B ");
    }
    public static void main(String[] args)
    {
        Q1 obj = new Q1();
        Thread thread = new Thread(obj);

        thread.start();
        System.out.printf("C ");
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("D");
    }
}
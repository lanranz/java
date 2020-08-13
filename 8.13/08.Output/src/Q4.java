class myThread implements Runnable
{
    public void run()
    {
        Q4.obj.notify();
    }
}

public class Q4 implements Runnable
{
    public static Q4 obj;
    private int data;
    public Q4()
    {
        data = 10;
    }
    public void run()
    {
        obj = new Q4();
        try {
            obj.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.data += 20;

        System.out.println(obj.data);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Q4());
        Thread thread2 = new Thread(new myThread());

        thread1.start();
        thread2.start();

        System.out.printf(" A - ");
    }
} 
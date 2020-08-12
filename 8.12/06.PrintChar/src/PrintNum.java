public class PrintNum extends Thread{



    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 52; i=i+2) {
            synchronized (Main.class){
                System.out.print(i+1);
                System.out.print(i+2);
                Main.class.notify();
                try {
                    Main.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

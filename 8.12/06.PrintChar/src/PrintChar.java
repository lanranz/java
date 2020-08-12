public class PrintChar extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 26; i++) {
            synchronized (Main.class){
                try {
                    Main.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                char a = (char) ('A' + i);
                System.out.print(a +" ");
                Main.class.notify();
            }
        }
    }
}

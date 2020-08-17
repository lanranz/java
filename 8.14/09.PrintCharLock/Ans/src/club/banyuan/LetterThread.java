package club.banyuan;

public class LetterThread extends Thread {


    @Override
    public void run() {

        char aChar = 'A';
        Main.lock.lock();
        try {
            while (aChar <= 'Z') {
                Main.condition.await();
                System.out.printf("%s ", aChar);
                Thread.sleep(500);
                aChar++;
                Main.condition.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Main.lock.unlock();
        }
    }

}

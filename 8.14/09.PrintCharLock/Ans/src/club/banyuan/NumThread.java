package club.banyuan;

import java.util.concurrent.locks.Lock;

public class NumThread extends Thread {


    @Override
    public void run() {
        int num = 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.lock.lock();
        try {
            while (num <= 52) {
                System.out.printf("%d %d ", num, num + 1);
                num += 2;
                Thread.sleep(500);
                Main.condition.signal();
                Main.condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Main.lock.unlock();
        }
    }
}

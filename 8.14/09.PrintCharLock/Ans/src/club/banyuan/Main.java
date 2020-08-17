package club.banyuan;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

  public static Lock lock = new ReentrantLock();
  public static Condition condition = lock.newCondition();


  public static void main(String[] args) {
    LetterThread t1 = new LetterThread();
    NumThread t2 = new NumThread();
    t2.start();
    t1.start();
  }
}

package club.banyuan;

import java.util.Scanner;

public class ScanThread extends Thread {

  // 开启一个线程，接收键盘的输入，将输入的值，逐个字符依次输出到屏幕上，输出每个字符的时间间隔是500ms
  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);
    char[] chars = scanner.nextLine().toCharArray();
    for (char aChar : chars) {
      System.out.print(aChar);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    ScanThread scanThread = new ScanThread();
    scanThread.start();
  }
}

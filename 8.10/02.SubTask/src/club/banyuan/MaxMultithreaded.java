package club.banyuan;

public class MaxMultithreaded extends Thread{



  /**
   * 计算数组元素的sin值之后，返回最大值。
   *
   * @param arr 目标数组
   * @return sin(数组元素)的最大值
   * @throws InterruptedException 不应该出现此异常
   */



  public static double max(int[] arr, int numThreads) throws InterruptedException {
    int len = arr.length;
    double ans = 0;

    SumThread[] ts = new SumThread[numThreads];
    for (int i = 0; i < numThreads; i++) {
      ts[i] = new SumThread(arr, (i * len) / numThreads, ((i + 1) * len / numThreads));
      ts[i].start();
    }


    for (int i = 0; i < numThreads; i++) {
      ts[i].join();
      if (ans < ts[i].getAns()) {
        ans = ts[i].getAns();
      }
    }
    return ans;
  }
}

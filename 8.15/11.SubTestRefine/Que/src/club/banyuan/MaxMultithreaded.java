package club.banyuan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class MaxThread implements Callable<Double> {

  private int lo, hi;
  private int[] arr;
  private double ans = 0;

  public MaxThread(int[] arr, int lo, int hi) {
    this.lo = lo;
    this.hi = hi;
    this.arr = arr;
  }

  @Override
  public Double call() {
    ans = Math.sin(arr[lo]);
    for (int i = lo; i < hi; i++) {
      double sin = Math.sin(arr[i]);
      if (ans < sin) {
        ans = sin;
      }
    }
    return ans;
  }


}

public class MaxMultithreaded {

  /**
   * 计算数组元素的sin值之后，返回最大值。
   *
   * @param arr 目标数组
   * @return sin(数组元素)的最大值
   * @throws InterruptedException 不应该出现此异常
   */
  public static double max(int[] arr, int numThreads) throws InterruptedException, ExecutionException {
    int len = arr.length;
    double ans = Double.NEGATIVE_INFINITY;

    // 创建并启动线程。
    ExecutorService threadPoolExecutor= Executors.newFixedThreadPool(numThreads);

    // 等待线程完成并计算它们的结果。
    List<Future<Double>> res=new ArrayList<>();
    for (int i = 0; i < numThreads; i++) {
      Future submit = threadPoolExecutor.submit(new MaxThread(arr, (i * len) / numThreads, ((i + 1) * len / numThreads)));
      res.add(submit);
    }

    for (int i = 0; i <numThreads ; i++) {
      if (res.get(i).get() > ans) {
        ans = res.get(i).get();
      }
    }
    return ans;
  }
}
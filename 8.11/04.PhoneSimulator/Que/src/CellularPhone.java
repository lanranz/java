public class CellularPhone extends Thread {

  private volatile boolean callInProgress = false;//是否在打电话
  private volatile boolean keepGoing = true;//电话接听程序是否运行

  public CellularPhone(String name) {
    super(name);
  }

  /**
   * 电话模拟器，可以被告知电话已经开始，电话已经结束，并且可以在屏幕上显示一个信息字符串
   * 假设控制台是手机的窗口。
   *
   * @param message 要显示的消息
   */
  void display(String message) {
    System.out.println(message);
  }

  /**
   * 接听电话。在终端显示消息。
   *
   * @param name               调用方的名称
   * @param callDisplayMessage 呼叫正在进行时显示的消息
   */
  public void startCall(String name, String callDisplayMessage) {
    callInProgress = true;
    display("<" + name + ">: Call (" + callDisplayMessage + ") begins");
  }

  /**
   * 挂断电话。在此方法完成后，电话能够接听其他电话。
   *
   * @param name               调用方的名称
   * @param callDisplayMessage 要显示的消息
   */
  public void endCall(String name, String callDisplayMessage) {
    display("   <" + name + ">: Call (" + callDisplayMessage + ") ends");
    callInProgress = false;
  }

  /**
   * 显示手机正在等待做某事
   */
  private synchronized void displayWaiting() {
    display("<" + this.getName() + ">: Waiting...");
  }

  /**
   * 停止电话接听程序
   */
  public void stopPhone() {
    keepGoing = false;
  }

  /**
   * 运行模拟器
   */
  public void run() {
    // 循环直到stopPhone被调用
    while (keepGoing) {
      // 如果没有电话
      if (!callInProgress) {
        displayWaiting();
        // 假装手机在做别的事情
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

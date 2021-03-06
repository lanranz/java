public class WithdrawThread implements Runnable {

  private final int amount;
  private final Account account;

  WithdrawThread(Account y, int amount) {
    account = y;
    this.amount = amount;
  }

  public void run() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    account.withdraw(amount);
  }
}
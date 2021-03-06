public class Driver {

  public static void main(String[] args) throws InterruptedException {
    // 创建一个电话
    // 创建一个电话
    CellularPhone aPhone = new CellularPhone("Phone");
    aPhone.start();

    // 创建两个呼叫生成器，他们坚持不断地给电话打电话。
    PhoneCallGenerator pcGen1 = new PhoneCallGenerator("Tom", aPhone);
    PhoneCallGenerator pcGen2 = new PhoneCallGenerator("Jerry", aPhone);
    MessageGenerator messageGenerator = new MessageGenerator("lisi", aPhone);
    MessageGenerator messageGenerator1 = new MessageGenerator("zhangsan", aPhone);
    messageGenerator.start();
    messageGenerator1.start();
    pcGen1.start();
    pcGen2.start();

    // 等待，直到所有的电话都结束
    pcGen1.join();
    pcGen2.join();
    messageGenerator.join();
    messageGenerator1.join();
    // 停止电话
    aPhone.stopPhone();
  }
}

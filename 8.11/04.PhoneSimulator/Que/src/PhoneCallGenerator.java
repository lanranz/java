import java.util.Random;

/**
 * 生成对特定电话的呼叫
 * 用于向电话呼叫
 */
public class PhoneCallGenerator extends Thread {

    private CellularPhone phone;

    public PhoneCallGenerator(String name, CellularPhone thePhone) {
        super(name);
        phone = thePhone;
    }

    public void run() {
        Random random = new Random();
        // 生成20个电话
        synchronized (phone) {
            for (int i = 0; i < 20; i++) {

                phone.startCall(getName(), String.valueOf(i));
                int time = random.nextInt(1000);
                try {
                    phone.join(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                phone.endCall(getName(), String.valueOf(i));
            }

        }


    }

}

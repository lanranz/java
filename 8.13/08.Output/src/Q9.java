class Test1 implements Runnable {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Run");
    }
}

class Myclass1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Test1());
        t1.start();
        System.out.println("Main");
    }
}
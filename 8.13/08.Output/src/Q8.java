class Test implements Runnable {
    public void run() {
        System.out.println("Run");
    }
}

class Myclass {
    public static void main(String[] args) {
        Test tt = new Test();
        Thread t = new Thread(tt);
        t.start();
        System.out.println("Main");
    }
}
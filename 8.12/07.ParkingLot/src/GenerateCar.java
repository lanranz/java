public class GenerateCar extends Thread{

    @Override
    public void run() {
        int i = 1000;
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Park.park.remainPark()==0){
                System.out.println("停车场已经满了，停止生产");
                try {
                    Park.park.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Car car = new Car("车牌号"+ i++);
            car.start();
        }
    }

    public static void main(String[] args) {
        GenerateCar generateCar = new GenerateCar();
        generateCar.start();
    }
}

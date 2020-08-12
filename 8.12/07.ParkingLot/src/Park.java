import java.util.*;

public class Park {

    private int parkNum;
    private List<Car> cars = new ArrayList<>();
    public static Park park = new Park(50);

    public Park(int parkNum) {
        this.parkNum = parkNum;
    }

    public int getParkNum() {
        return parkNum;
    }

    //入库
    public void inGarage(Car car) {
        if (cars.size() < parkNum) {
            cars.add(car);
        } else {
            System.out.println("车位不足");
        }
    }


    //出库
    public void outGarage(Car car) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String numberPlate = iterator.next().getNumberPlate();
            if (car.getNumberPlate().equals(numberPlate)) {
                iterator.remove();
                park.notifyAll();
            }
        }
    }

    //剩余车位
    public int remainPark() {
        return parkNum - cars.size();
    }

    //根据车牌号查询汽车对象
    public Car inquireByNumber(String numberPlate) {
        for (Car car : cars) {
            if (numberPlate.equals(car.getNumberPlate())) {
                return car;
            }
        }
        return null;
    }

    //查看车位编号是否停车
    public boolean isPark(int parkId) {
        if (parkId <= cars.size()) {
            System.out.println("这个车位有车");
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.print("车位" + (i + 1));
            System.out.println(cars.get(i).getNumberPlate());
        }
    }
}

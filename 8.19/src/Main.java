import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("欢迎使⽤半圆租⻋车系统 ");
        while (true) {
            System.out.println("================");
            System.out.println("1. 添加⻋车辆" );
            System.out.println("2. 查询⻋车辆" );
            System.out.println("3. 出租⻋车辆" );
            System.out.println("4. 归还⻋车辆");
            System.out.println("0. 退出系统");

            switch (scanner.nextLine()){
                case "1":
                    add();
                    break;
                case "2":
                    search();
                    break;
                case "3":
                    rent();
                    break;
                case "4":
                    remand();
                    break;
                case "0":
                    System.out.println("谢谢使用");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }


    }

    private static void remand() {
        System.out.println("请选择租⽤的⻋车辆编号(0返回上⼀级):");
        for (Car car : cars) {
            if (car.isRent==true){
                System.out.print((cars.indexOf(car)+1)+"."+car);
            }
        }
        System.out.println();
        int index = Integer.parseInt(scanner.nextLine());
        if(index==0){
            return;
        }
        cars.get(index-1).setRent(false);

    }

    private static void rent() {
        System.out.println("请选择租⽤的⻋车辆编号(0返回上⼀级):");
        int index = Integer.parseInt(scanner.nextLine());
        if(index== 0){
            return;
        }
        cars.get(index-1).setRent(true);
        System.out.println(cars.get(index-1));
    }

    private static void search() {
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(cars.get(index-1));
    }

    private static void add() {
        Car car = new Car();
        System.out.println("请输入车辆年份（四位数年份）：");
        int year = Integer.parseInt(scanner.nextLine());
        car.setYear(year);
        System.out.println(year);
        System.out.println("请输入车辆厂家：");
        String company = scanner.nextLine();
        car.setCompany(company);
        System.out.println(company);
        System.out.println("请输入要添加的车辆类型 1.客⻋ 2.货⻋");
        switch (scanner.nextLine()){
            case "1":
                car.setType("客车");
                System.out.println("请输入客车载客量：");
                int passengerNum = Integer.parseInt(scanner.nextLine());
                Bus bus = new Bus(car.getYear(),car.getCompany(),car.getType(),passengerNum);
                cars.add(bus);
                System.out.println("添加成功");
                System.out.println(bus);
                break;
            case "2":
                car.setType("货车");
                System.out.println("请输⼊卡⻋车的载重量：");
                double weight = Double.parseDouble(scanner.nextLine());
                Truck truck = new Truck(car.getYear(),car.getCompany(),car.getType(),weight);
                cars.add(truck);
                System.out.println("添加成功");
                System.out.println(truck);
                break;
        }
    }
}

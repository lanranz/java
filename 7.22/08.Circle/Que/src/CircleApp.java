public class CircleApp {

    public static void main(String[] args) {
        double rd = 12.3;
        System.out.println("半径 = " + rd);

        Circle circle1 = new Circle(rd);
        double cir = circle1.calPerimeter();
        double area = circle1.calArea();

        System.out.println("周长：" + cir);
        System.out.println("面积：" + area);

        Circle circle2 = new Circle(circle1);
        circle1.setRadius(30);
        System.out.println(circle2.getRadius());

        Circle circle3 = circle2;
    }
}

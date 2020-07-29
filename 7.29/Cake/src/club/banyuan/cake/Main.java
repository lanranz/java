package club.banyuan.cake;

public class Main {
    public static void main(String[] args) {
        Cake[] cakes;
        Cake cake0 = new ReadyMadeCake(10, 6, 0);
        Cake cake1 = new OrderCake(5, 20, 1);
        Cake cake2 = new ReadyMadeCake(20, 5, 2);
        Cake cake3 = new OrderCake(3, 20, 3);
        Cake cake4 = new ReadyMadeCake(15, 7, 4);
        Cake cake5 = new OrderCake(4, 17, 5);
        Cake cake6 = new ReadyMadeCake(2, 5, 6);
        Cake cake7 = new OrderCake(1, 30, 7);
        Cake cake8 = new ReadyMadeCake(20, 10, 8);
        Cake cake9 = new OrderCake(3, 10, 9);

        cakes = new Cake[]{cake0, cake1, cake2, cake3, cake4, cake5, cake6, cake7, cake8, cake9};

        double totalPrice = 0;
        for (int i = 0; i < cakes.length; i++) {
            totalPrice += cakes[i].calPrice();
        }

        System.out.println("所有蛋糕的总价：" + totalPrice);

        double readyMadeCakePrice = 0;
        int readyMadeCakeQuantity = 0;
        for (int i = 0; i < cakes.length; i = i + 2) {
            readyMadeCakePrice += cakes[i].calPrice();
            ReadyMadeCake readyMadeCake = (ReadyMadeCake) cakes[i];
            readyMadeCakeQuantity += readyMadeCake.getQuantity();
        }
        System.out.println("ReadyMadeCake蛋糕的总价"+readyMadeCakePrice);
        System.out.println("ReadyMadeCake蛋糕的总数"+readyMadeCakeQuantity);

        double MaxPrice = cakes[0].calPrice();
        int indexOf = 0;
        for (int i = 1; i < cakes.length; i++) {
            if(cakes[i].calPrice()>MaxPrice){
                MaxPrice = cakes[i].calPrice();
                indexOf = i;
            }
        }
        System.out.println(cakes[indexOf].toString());

        if(indexOf%2==0){
            System.out.println("按数量卖");
        }else{
            System.out.println("按斤卖");
        }

    }
}

package club.banyuan.cake;

public class Cake {

    protected double price;
    protected int id;

    public Cake(double price, int id) {
        this.price = price;
        this.id = id;
    }

    protected double calPrice(){
        return 0.0;
    }
}

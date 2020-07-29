package club.banyuan.cake;

public class OrderCake extends Cake {

    private double weightInKG;

    public OrderCake(double weightInKG, double price, int id) {
        super(price, id);
        this.weightInKG = weightInKG;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    @Override
    protected double calPrice() {
        return price * weightInKG;
    }

    @Override
    public String toString() {
        return "OrderCake{" +
                "weightInKG=" + weightInKG +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

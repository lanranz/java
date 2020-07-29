package club.banyuan.cake;

public class ReadyMadeCake extends Cake {

    private double quantity;

    public ReadyMadeCake(double quantity, double price, int id) {
        super(price, id);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    protected double calPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "ReadyMadeCake{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

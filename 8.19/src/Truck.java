public class Truck extends Car{
    private double weight;

    public Truck(int year, String company, String type, double weight) {
        super(year, company, type);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getYear()+"年"+this.getCompany()+this.getType()+","+
                "载重量"+this.getWeight()+"吨"+"，"+(this.isRent ? "已出租" : "未出租");
    }
}
public class Bus extends Car {

    private int passengerNum;

    public Bus(int year, String company, String type, int passengerNum) {
        super(year, company, type);
        this.passengerNum = passengerNum;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    @Override
    public String toString() {
        return this.getYear()+"年"+this.getCompany()+this.getType()+","+
                this.getPassengerNum()+"座"+"，"+(this.isRent ? "已出租" : "未出租");
    }
}

package club.banyuan;

public class Commission extends Hourly {
    private double totalSales = 0;
    private double salaryRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double salaryRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.salaryRate = salaryRate;
    }

    public double getTotalSale() {
        return totalSales;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double paySalary = totalSales * salaryRate + super.pay();
        totalSales = 0;
        return paySalary;
    }

    public String toString() {
        String result = super.toString();
        result += "\n总销售额: " + totalSales;
        return result;
    }
}



public class Car {
    private int year;
    private String company;
    protected boolean isRent = false;
    private String type;

    public Car(int year, String company, String type) {
        this.year = year;
        this.company = company;
        this.type = type;
    }

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class Product {
    private String name;
    private double price;
    private int scanCode;
    private int num;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getScanCode() {
        return scanCode;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getInfo() {
        return "--- 产品信息 ---\n" +
                "名称: " + name +
                "\n编码：" + scanCode +
                "\n价格: " + price + "元\n";
    }

    public void changePrice(double price) {
        this.price = price;
    }

    boolean buy(int num) {
        if (num <= 0) {
            System.out.println("购买数量错误");
            return false;
        } else if (this.num - num < 0) {
            System.out.println("库存不足");
            return false;
        }
        this.num -= num;
        return true;
    }
}

package club.banyuan.cat;

public class Cat {
    String variety;
    String color;

    public Cat(String variety, String color) {
        this.variety = variety;
        this.color = color;
    }

    public Cat() {
    }

    public String getInfo(){
        return this.color+this.variety;
    }

    public void print(){
        System.out.println(this.getInfo());
    }

    public void playWith(club.banyuan.dog.Dog dog){
        System.out.println(this.getInfo()+"和"+dog.getInfo()+"一起玩");
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

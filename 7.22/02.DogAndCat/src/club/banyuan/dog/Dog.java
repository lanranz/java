package club.banyuan.dog;

import club.banyuan.cat.Cat;

public class Dog {
    private String variety;
    private int IQ;

    public Dog(String variety, int IQ) {
        this.variety = variety;
        this.IQ = IQ;
    }

    public Dog() {
    }

    public String getInfo() {
        if (this.IQ < 20) {
            return "傻" + this.variety;
        } else if (this.IQ > 80) {
            return "聪明的" + this.variety;
        } else {
            return "普通的" + this.variety;
        }
    }

    public void printInfo() {
        System.out.println(this.getInfo());
    }

    public void playWith(club.banyuan.cat.Cat cat) {
        System.out.println(this.getInfo()+"和"+ cat.getInfo()+"一起玩");
    }


    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
}

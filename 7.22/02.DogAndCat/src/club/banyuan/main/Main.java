package club.banyuan.main;

public class Main {
    public static void main(String[] args) {
        club.banyuan.dog.Dog dog1 = new club.banyuan.dog.Dog("哈士奇",-100);
        club.banyuan.dog.Dog dog2 = new club.banyuan.dog.Dog("金毛",100);
        club.banyuan.dog.Dog dog3 = new club.banyuan.dog.Dog("柯基",40);
        club.banyuan.cat.Cat cat1 = new club.banyuan.cat.Cat("波斯","白色");
        club.banyuan.cat.Cat cat2 = new club.banyuan.cat.Cat("英短","黑色");
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        cat1.print();
        cat2.print();
        cat1.playWith(dog1);
        dog2.playWith(cat2);
    }
}

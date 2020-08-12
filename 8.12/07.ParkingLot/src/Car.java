import java.util.Random;

public class Car extends Thread{
    private String numberPlate;


    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public void run() {
        Random random = new Random();
        if(Park.park.remainPark()>0){
            Park.park.inGarage(this);
            try {
                this.join(random.nextInt(10)*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Park.park.outGarage(this);
        }
        try {
            Park.park.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

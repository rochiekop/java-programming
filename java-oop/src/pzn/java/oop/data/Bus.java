package pzn.java.oop.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Buss");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "VOLVO";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}

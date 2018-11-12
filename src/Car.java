package wlc;

public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
	super(brand, kilometers);
    }
    
    public String doStuff() {
	return String.format("Je suis %s et je fais vroum vroum", super.getBrand());
    }
}

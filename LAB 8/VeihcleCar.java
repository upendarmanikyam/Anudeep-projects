package javafullstack;
public class VeihcleCar {
    String brand;
    String model;
    int year;

    public VeihcleCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(brand + " " + model + " " + year +" ");
    }

    public static class Car {
        String color;
        VeihcleCar vehicle;

        public Car(String color, VeihcleCar vehicle) {
            this.color = color;
            this.vehicle = vehicle;
        }

        public void honk() {
            System.out.println(color);
            
        }
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	VeihcleCar vehicle = new VeihcleCar("Tata", "Super Model", 2024);
        Car car = new Car("blue", vehicle);
        vehicle.drive();
        car.honk();
    }
}




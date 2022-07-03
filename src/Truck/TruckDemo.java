package Truck;

public class TruckDemo {
    public static void main(String[] args) {
        Truck vito = new Truck(10, 60, 20, 5000);
        System.out.println("Vito can carry " + vito.getCargo() + " pounds");
    }
    }

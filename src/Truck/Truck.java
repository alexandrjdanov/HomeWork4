package Truck;

public class Truck extends Vehicle{

    int cargocap;

    Truck(int numberOfPassengers, int fuelCapVolume, int milesPerGallon, int cargocap) {
        super(numberOfPassengers, fuelCapVolume, milesPerGallon);
        this.cargocap = cargocap;
    }

    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

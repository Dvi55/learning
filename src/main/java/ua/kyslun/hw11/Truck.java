package ua.kyslun.hw11;

public class Truck extends Car {
    private int cargo;

    public Truck(String series, int year, String color, int fuelTankSize, int fuelAmount, int fuelConsumption) {
        super(series, year, color, fuelTankSize, fuelAmount, fuelConsumption);
        cargo = 0;
    }

    public void loadCargo(int amount) {
        cargo += amount;
        System.out.println("Cargo loaded. Total amount: " + cargo);
    }

    public void unloadCargo(int amount) {
        if (amount > cargo) {
            System.out.println("Cannot unload more cargo than available.");
        }
        if ((amount - cargo) < 0) {
            System.out.println("Cargo cannot be a negative value");
        } else {
            cargo -= amount;
            System.out.println("Cargo unloaded. Total amount: " + cargo);
        }
    }

    @Override
    public void drive() {
        while (getFuelAmount() > 0) {
            setFuelAmount(getFuelConsumption() * 2);
            System.out.println("Drive. Fuel level: " + getFuelAmount());
        }
        System.out.println("Out of fuel.");
    }
}



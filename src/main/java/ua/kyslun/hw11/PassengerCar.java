package ua.kyslun.hw11;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PassengerCar extends Car implements Recovery {
    private int passengerCount;

    public PassengerCar(String series, int year, String color, int tankSize, int fuelLevel, int fuelConsumption) {
        super(series, year, color, tankSize, fuelLevel, fuelConsumption);
        passengerCount = 0;
    }

    @Override
    public void refuel() {
        setFuelAmount(getFuelTankSize());
    }

    private class Passenger {
        public void addPassenger() {
            if (passengerCount >= 3) {
                System.out.println("Cannot add more passengers.");
            } else {
                passengerCount++;
                System.out.println("Passenger added. Total count: " + passengerCount);
            }
        }
    }
}

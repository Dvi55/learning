package ua.kyslun.hw11;

import lombok.Getter;
import lombok.Setter;

//b) Создать дочерний класс passenger car
//- добавить поле класс passenger
//- добавить метод посадить пассажира (в машине не может быть более 3
//пассажиров)
//c) Создать дочерний класс truck
//- добавить поле cargo
//- добавить метод погрузки и выгрузки груза
//- переопределить метод движения (потребления топлива х2 от нормы)
//d) Создать интерфейс Recovery с методом refuel (восстанавливает топливо машины
//до полного значения)
//e) Имплементировать интерфейс в созданных ранее типах машин
@Setter
@Getter
public class Car implements Recovery {
    private String series;
    private int year;
    private String color;
    private int fuelTankSize;
    private int fuelAmount;
    private int fuelConsumption;

    public Car(String series, int year, String color, int fuelTankSize, int fuelAmount, int fuelConsumption) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuelTankSize = fuelTankSize;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive() {
        int i = 0;
        if (getFuelAmount() < fuelConsumption) {
            System.out.println("Not enough fuel");
            return;
        }
        while (fuelAmount > 0) {
            i += 1;
            setFuelAmount(getFuelAmount() - fuelConsumption);
            System.out.println("Car drive " + i + "times");
            System.out.println("Need refill fuel");
        }
    }

    public void getStatistic() {
        System.out.println("Car " + getSeries() + "series, Year of release - " + getYear() + ", have " + getColor() + "color");
        System.out.println("Now in tank " + getFuelAmount() + "litters of fuel");
        System.out.println("Fuel consumption is " + getFuelConsumption() + "L/100km");
    }

    @Override
    public void refuel() {
        setFuelAmount(getFuelTankSize());
    }
}

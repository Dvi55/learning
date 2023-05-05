package ua.kyslun.hw11;
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
public class Car implements Recovery{
    private String series;
    private int year;
    private String color;
    private int fuelTankSize;
    private int fuelAmount;
    private int fuelConsumption;

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Car(String series, int year, String color, int fuelTankSize, int fuelAmount, int fuelConsumption) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuelTankSize = fuelTankSize;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive() {
        if (getFuelAmount() > 0) {
            setFuelAmount(getFuelAmount() - 1);
            System.out.println("Car drive");
        }
        else {
            System.out.println("No fuel. Need refill");
        }
    }
    public void getStatistic() {
        System.out.println("Car " + getSeries() + "series, Year of release - " + getYear() + ", have " + getColor() + "color");
        System.out.println("Now in tank " + getFuelAmount() + "litters of fuel");
        System.out.println("Fuel consumption is " +getFuelConsumption() + "L/100km");
    }

    @Override
    public void refuel() {
        setFuelAmount(getFuelTankSize());
    }
}

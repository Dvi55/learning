package ua.kyslun.hw6;

public class Phone {
    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    private long number;
    private String model;
    private int weight;

    public void receiveCall(String callerName) {
        System.out.println("Calls " + callerName);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}

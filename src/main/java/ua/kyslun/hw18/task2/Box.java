package ua.kyslun.hw18.task2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Box {
    private String from;
    private String material;
    private String color;
    @JsonProperty("max-lifting-capacity")
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    @JsonProperty("delivery-date")
    private String deliveryDate;

}

@Data
class MaxLiftingCapacity {
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("value")
    private int value;
}

@Data
class Cargo {
    @JsonProperty("name")
    private String name;
    @JsonProperty("class")
    private String classOfCargo;
}

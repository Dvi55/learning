package ua.kyslun.hw18.task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getResourceAsStream("/Box.json");
            ObjectMapper objectMapper = new ObjectMapper();
            Box box = objectMapper.readValue(inputStream, Box.class);
            System.out.println(box.getFrom());
            System.out.println(box.getDeliveryDate());
            System.out.println(box.getCargo());
        } catch (IOException | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
package ua.kyslun.hw22.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Group {
    //Create model Group
    //ид
    //название
    //дата создания (LocalDate)
    //Студенты
    private String id;
    private String groupName;
    private LocalDate dateCreate;
    private Set<Student> students;
}

package ua.edu.ucu.app.task1;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@Getter
@Setter
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;


}

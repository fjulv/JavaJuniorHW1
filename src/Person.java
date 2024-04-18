import lombok.*;

@Data
@AllArgsConstructor

public class Person {

    private String name;
    private int age;
    private double salary;
    private Department department;
}



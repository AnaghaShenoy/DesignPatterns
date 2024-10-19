package Builder;


public class Student {
    int age;
    String name;
    String batch;
    int gradYear;

    Student(StudentBuilder builder) {
        // validations
        if(builder.age < 20) {
            throw new IllegalArgumentException("Age must be atleast 20 years");
        }

        if(builder.gradYear > 2024) {
            throw new IllegalArgumentException("Grad year must be smaller than 2024");
        }

        // setting the attributes
        age = builder.age;
        name = builder.name;
        batch = builder.batch;
        gradYear = builder.gradYear;
    }
}
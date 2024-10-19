package Builder;


public class StudentBuilder {
    int age;
    String name;
    String batch;
    int gradYear;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
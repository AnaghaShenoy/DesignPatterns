package Builder;

public class Client {
    public static void main(String args[]) {

        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(24);
        studentBuilder.setBatch("Aug2017");
        studentBuilder.setGradYear(2021);

        Student s = new Student(studentBuilder);
    }
}
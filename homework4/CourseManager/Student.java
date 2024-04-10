package ntou.cs.java2024;
//javac -d . Student.java
public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
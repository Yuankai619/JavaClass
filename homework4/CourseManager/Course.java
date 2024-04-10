package ntou.cs.java2024;
import java.util.ArrayList;
import ntou.cs.java2024.Student;
//java ntou.cs.java2024.CourseManagerTest
public class Course {
    private final String courseName;
    private ArrayList<Student> studentList;
    private final int maxStudents;

    public Course(String courseName, int maxStudents) {
        if (courseName == null || courseName.trim().isEmpty()) throw new IllegalArgumentException("Course name cannot be null or empty");
        if (maxStudents <= 0) throw new IllegalArgumentException("Maximum students must be a positive integer");
        
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        if (this.studentList.size() >= this.maxStudents) {
            System.out.println("Cannot add student " + student.getName() + ", course " + this.courseName + " has reached maximum capacity");
            return;
        }
        this.studentList.add(student);
        System.out.println("Student " + student.getName() + " successfully added to course " + this.courseName);
    }

    public void removeStudent(Student student) {
        if (this.studentList.remove(student)) {
            System.out.println("Student " + student.getName() + " successfully removed from course " + this.courseName);
        } else {
            System.out.println("Student " + student.getName() + " is not enrolled in course " + this.courseName);
        }
    }
    public String getCourseName() {
        return this.courseName;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Course: " + this.courseName + "\nMaximum Students: " + this.maxStudents + "\nStudents Enrolled:\n");
        for (Student s : this.studentList) {
            sb.append("- ").append(s.getName()).append("\n");
        }
        return sb.toString();
    }
}

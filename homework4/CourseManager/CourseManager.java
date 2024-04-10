package ntou.cs.java2024;

import java.util.ArrayList;
import ntou.cs.java2024.Course;
public class CourseManager {
    private static final ArrayList<Course> courses = new ArrayList<>();

    public static void addCourse(Course course) {
        if (course == null) throw new IllegalArgumentException("Course cannot be null");
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " successfully added");
    }

    public static Course findCourse(String courseName) {
        for (Course c : courses) {
            if (c.getCourseName().equals(courseName)) {
                return c;
            }
        }
        return null; // or throw an exception if you prefer
    }

    public static void printAllCoursesInfo() {
        System.out.println("\nCourses Information:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}

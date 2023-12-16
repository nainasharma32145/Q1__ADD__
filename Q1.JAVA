import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentId;
    private String name;
    private List<Course> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    // Additional methods as needed
}

class Course {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(this);
    }

    // Additional methods as needed
}

class StudentManagementSystem {
    private List<Student> students;
    private List<Course> courses;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Additional methods for managing the system
}

public class Main {
    public static void main(String[] args) {
        // Example usage of the student management system
        StudentManagementSystem system = new StudentManagementSystem();

        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Smith");

        Course course1 = new Course("C1", "Introduction to Java");
        Course course2 = new Course("C2", "Database Management");

        system.addStudent(student1);
        system.addStudent(student2);

        system.addCourse(course1);
        system.addCourse(course2);

        course1.enrollStudent(student1);
        course2.enrollStudent(student1);
        course2.enrollStudent(student2);

        // Additional operations and queries can be added
    }
}


class UserInterface {
    public static void displayStudentInfo(Student student) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());
        // Additional display logic
    }

    public static void displayCourseInfo(Course course) {
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Name: " + course.getCourseName());
        System.out.println("Enrolled Students: " + course.getEnrolledStudents());
        // Additional display logic
    }

    // Additional UI-related methods
}

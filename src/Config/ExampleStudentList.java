package Config;

import Student.Student;

import java.util.ArrayList;
import java.util.List;

public class ExampleStudentList {

    /**
     * Creates a list of ten students
     * @return size-10 List of students
     * */
    public static List<Student> getSampleList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Gizem", 3.84));
        studentList.add(new Student(2,"Gizem", 3.84));
        studentList.add(new Student(3,"Abdullah", 4));
        studentList.add(new Student(4,"Abdullah", 3.08));
        studentList.add(new Student(5,"Elif", 2.14));
        studentList.add(new Student(6,"Elif", 2.99));
        studentList.add(new Student(7,"Yaman", 1.84));
        studentList.add(new Student(8,"Yaman", 3.97));
        studentList.add(new Student(9,"Ali", 2.99));
        studentList.add(new Student(10,"Ali", 4));
        return studentList;
    }
}

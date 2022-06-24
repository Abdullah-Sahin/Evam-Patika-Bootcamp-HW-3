package Student;

import java.util.List;
import java.util.Optional;

public class StudentService {

    /**
     * adds new student to the list, after addition, serves the student with highest priority
     * and removes it from the list.
     * @param student the student to be added
     * @param students list of students into which the student will be added
     */
    public static void addStudent(Student student, List<Student> students){
        students.add(student);
        Priorities.getOrderedStudents(students);
        deleteStudent(students);
    }

    /**
     * Deletes first student from the list
     * @param students list of students to be served
     */
   static void deleteStudent(List<Student> students){
        students.remove(0);
    }

    /**
     * Checks whether a student exists with given id
     * @param id to be controlled in the list of students
     * @param students the list in which id of students will be checked
     * @return true if a student with given id exists, false otherwise
     */
    public static boolean checkForId(int id, List<Student> students){
        Optional<Student> student = students.stream().filter(t -> t.getId() == id).findFirst();
        return student.isPresent();
    }
}

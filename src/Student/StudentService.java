package Student;

import java.util.List;
import java.util.Optional;

public class StudentService {

    /**
     * adds new student to the list, after addition
     * @param student the student to be added
     * @param students list of students into which the student will be added
     */
    public static void addStudent(Student student, List<Student> students){
        students.add(student);
        Priorities.getOrderedStudents(students);
    }

    /**
     * Deletes first student from the list
     * @param students list of students to be served,
     * @return the student served
     */
   public static Student deleteStudent(List<Student> students){
        Student toDelete = students.get(0);
        students.remove(toDelete);
        return toDelete;
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

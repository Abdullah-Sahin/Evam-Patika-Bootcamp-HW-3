package Student;

import java.util.Comparator;
import java.util.List;

public class Priorities{

    /**
     * Takes a list of students and then order them according to cgpa, name and id
     * @param students list of all student without any priority
     * @return list of students with priorities
     */
    public static List<Student> getOrderedStudents(List<Student> students){
        students.sort(Comparator.comparing(Student::getCGPA).reversed().
                thenComparing(Student::getFullName)
                .thenComparing(Student::getId));

        return students;
    }

}

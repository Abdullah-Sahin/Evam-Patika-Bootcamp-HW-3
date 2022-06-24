package Student;

public class Student{

    private final int Id;
    private final double CGPA;
    private final String fullName;

    public Student(int Id, String fullName, double CGPA) {
        this.Id = Id;
        if(CGPA > 4){
            CGPA = 4;
        }
        this.CGPA = CGPA;
        this.fullName = fullName;
    }

    public int getId() {
        return this.Id;
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public String getFullName() {
        return this.fullName.toUpperCase();
    }

    /**
     * Converts values of every field to a string line by line
     * @return lines of string values by fields
     */
    public String toString(){
        return "\nId: " + getId() +
                "\tname: " + getFullName() +
                "\tCGPA: " + getCGPA();
    }
}

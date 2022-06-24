import Config.ExampleStudentList;
import Student.Student;
import Student.Priorities;
import Student.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        List<Student> students = Priorities.getOrderedStudents(ExampleStudentList.getSampleList());
        Scanner scanner = new Scanner(System.in);
        int answer;

        do{
            System.out.println("Press " +
                    "\n1 to add new student to list" +
                    "\n2 to serve student with highest priority" +
                    "\n3 to see current students in order" +
                    "\n0 to exit");

            answer = Integer.parseInt(scanner.nextLine());

            switch (answer) {
                case 1:
                    int id;
                    do {
                        System.out.print("Enter an id: ");
                        id = Integer.parseInt(scanner.nextLine());
                        if(StudentService.checkForId(id, students)){
                            System.out.println("A student exists with given id");
                        }
                    } while (StudentService.checkForId(id, students));
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter CGPA (Use dot, not comma Ex: 2.14)");
                    double CGPA = Double.parseDouble(scanner.nextLine());
                    StudentService.addStudent(new Student(id,name,CGPA), students);
                    break;

                case 2:
                    try{
                        System.out.println(StudentService.deleteStudent(students) + " was served");
                    }
                    catch (Exception e){
                        System.out.println("List is empty");
                    }
                    break;
                case 3:

                    System.out.println(Priorities.getOrderedStudents(students));
                    break;

                case 0:
                    System.out.println("Program ended. GoodBye!");
                    break;

            }

        }while(answer != 0);

    }
}
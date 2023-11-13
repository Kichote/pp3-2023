import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    
    String studentName;
    double[] grades;
    int numberOfGrades;

    StudentGrades(String studentName, double[] grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    StudentGrades(String studentName, int numberOfGrades) {
        this.studentName = studentName;
        Random random = new Random();
        numberOfGrades = random.nextInt(10);
    }

    public StudentGrades(String studentName) {
        this.studentName = studentName;
        enterGradesFromKeyboard();
    }

    private void enterGradesFromKeyboard() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter grades for " + studentName + ":");
            
            System.out.print("Number of grades: ");
            int numberOfGrades1 = scanner.nextInt();

            grades = new double[numberOfGrades1];

            for (int i = 0; i < numberOfGrades1; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextInt();
            }

            scanner.close();
        }


    public double lowestGrade() {
        double lowestGrade = grades[0];
        for(int i = 0; i< grades.length - 1; i++) {
            if (lowestGrade > grades[i]) {
                lowestGrade = grades[i];
            }
        }
        return lowestGrade;
    }

    public double highestGrade() {
        double highestGrade = grades[0];
        for(int i = 0; i< grades.length - 1; i++) {
            if (highestGrade < grades[i]) {
                highestGrade = grades[i];
            }
        }
        return highestGrade;
    }

    public int numberOfGrades() {
        return grades.length;
    }

    public double gradePointAverage() {
        double sumOfGrades = 0;
        double numberOfGrades = numberOfGrades();
        for(double i : grades) {
            sumOfGrades = sumOfGrades + grades[0];
        }
        return sumOfGrades/numberOfGrades;
    }

    public String displayRecord() {
        List<Double> gradesList = new ArrayList<>();
        for(double grade : grades) {
            gradesList.add(grade);
        }
        return studentName + ": " + gradesList + "\nNumber of grades: " + numberOfGrades() +
         ", lowest grade: " + lowestGrade() + ", highest grade: " + highestGrade() + 
         "\nGrade point average: " + gradePointAverage();
    }

    public static void main(String[] args) {
        // double[] grades = {3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        // StudentGrades studentGrades = new StudentGrades("Amanda", grades);
        // System.out.println(studentGrades.displayRecord());;

        StudentGrades student = new StudentGrades("John Doe");

        double[] studentGrades = student.grades;
        System.out.println("Grades for " + student.studentName + ": " + Arrays.toString(studentGrades));
    }
}

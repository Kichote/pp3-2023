public class Student {

    String name;
    int age;
    int idCard;
    boolean isCardValid;
    int semester;
    float averageGrade;

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void displayName() {
        System.out.println("Student name: " + name);            
    }

    public void displayAge() {
        System.out.println("Student's age: " + age);
    }

    public void displayInfo() {
        System.out.println("Student's name: " + name + "\n Semester: " + semester + "\n Average grade: " + averageGrade);
    }

    public void changeCardValidation() {
        isCardValid = !isCardValid;
    }

    public void displayInfo1() {
        System.out.println("Student's name: " + name + "\n ID card number: " + idCard + "\n Is card valid: " + isCardValid);
    }

    void displayIdCardValiddation() {
        String valid = (isCardValid) ? "Card is valid" : "Card is invalid";
        System.out.println(valid + "\n");
    }
}
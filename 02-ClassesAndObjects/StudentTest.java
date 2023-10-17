public class StudentTest {
    
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.name = "Peter";
        student1.age = 21;

        student2.name = "Pablo";
        student2.age = 22;

        student3.name = "Michael";
        student3.age = 24;
        student3.idCard = 1234;
        student3.isCardValid = true;
        student3.semester = 2;
        student3.averageGrade = 4.2f;

        student4.name = "Monica";
        student4.age = 23;
        student4.idCard = 1233;
        student4.isCardValid = false;
        student4.semester = 4;
        student4.averageGrade = 3.8f;

        // student1.sayHello();
        // student1.displayName();
        // student1.displayAge();

        // student2.sayHello();
        // student2.displayName();
        // student2.displayAge();
    
        student4.displayInfo();
        student4.displayInfo1();
        student4.changeCardValidation();
        student4.displayInfo1();

        student3.displayInfo();
        student3.displayInfo1();
        student3.changeCardValidation();
        student3.displayInfo1();
        student3.changeCardValidation();
        student3.displayInfo1();
    }
}

public class Person {

    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to check if the person is an adult
    public boolean isAdult() {
        return age >= 18;
    }

    // Method to return a string representation of the object
    @Override
    public String toString() {
        return name + "," + age;
    }

    public static void main(String[] args) {
        // Creating a person and setting attributes' values
        Person p = new Person("Anna", 21);

        // Using getter method
        System.out.println("p.getAge() returns " + p.getAge());

        // Using isAdult method
        System.out.println("p.isAdult() returns " + p.isAdult());

        // Using setter method
        p.setAge(17);

        // Using isAdult method after changing age
        System.out.println("p.isAdult() returns " + p.isAdult());

        // Using toString method
        System.out.println("p.toString() returns \"" + p.toString() + "\"");
    }
}
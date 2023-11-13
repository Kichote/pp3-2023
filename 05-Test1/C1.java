public class C1 {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public C1(String name, int age) {
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

    // Method to check if a person is an adult
    public boolean isAdult() {
        return age >= 18;
    }

    // Method to get a string representation of the object
    @Override
    public String toString() {
        return name + "," + age;
    }

    public static void main(String[] args) {
        // Sample usage
        C1 person = new C1("Anna", 21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Adult? " + person.isAdult());

        // Change age
        person.setAge(17);

        System.out.println("Is Adult? " + person.isAdult());
        System.out.println("String representation: " + person.toString());
    }
}
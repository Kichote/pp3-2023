public class Person {

    public String name;

    public int weight;

    public int height;

    public double BMI;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    public void calculateBMI() {
        BMI = (weight/((height/100f)*(height/100f)));
    }

    public String displayRecord() {
        if (BMI >24.9) {
            return "BMI too high";
        } else if (BMI < 18.5) {
            return "BMI too low";
        }
        return name + ", " + weight + "kg, " + height + "cm, " + BMI;
    }

    public static void main(String[] args) {
        Person person = new Person("Paweł", 70, 170);
        person.calculateBMI();
        System.out.println(person.displayRecord());
    }
}
public class Counter {
    // Attribute
    private int value;

    // Constructor (initializes the counter to 0)
    public Counter() {
        this.value = 0;
    }

    // Method to increase the counter by 1
    public void increase() {
        value++;
    }

    // Method to decrease the counter by 1
    public void decrease() {
        value--;
    }

    // Overloaded method to increase the counter by n
    public void increase(int n) {
        value += n;
    }

    // Overloaded method to decrease the counter by n
    public void decrease(int n) {
        value -= n;
    }

    // Method to get the current value of the counter
    public int value() {
        return value;
    }

    public static void main(String[] args) {
        // Creating a counter
        Counter c = new Counter();

        // Using value method
        System.out.println("c.value() returns " + c.value());

        // Using increase method
        c.increase();
        c.increase();

        // Using decrease method
        c.decrease();

        // Using increase(int n) method
        c.increase(5);

        // Using decrease(int n) method
        c.decrease(2);

        // Using value method to get the final result
        System.out.println("c.value() returns " + c.value());
    }
}
public class C2 {
    private int counter;

    // Constructor with the initial value of the counter set to 0
    public C2() {
        this.counter = 0;
    }

    // Method to increase the counter by 1
    public void increase() {
        counter++;
    }

    // Method to decrease the counter by 1
    public void decrease() {
        counter--;
    }

    // Overloaded method to increase the counter by n
    public void increase(int n) {
        counter += n;
    }

    // Overloaded method to decrease the counter by n
    public void decrease(int n) {
        counter -= n;
    }

    // Method to get the current value of the counter
    public int value() {
        return counter;
    }

    public static void main(String[] args) {
        // Sample usage
        C2 counterObject = new C2();

        System.out.println("Initial Value: " + counterObject.value());

        counterObject.increase();
        counterObject.increase();
        counterObject.decrease();
        counterObject.increase(5);
        counterObject.decrease(2);

        System.out.println("Final Value: " + counterObject.value());
    }
}
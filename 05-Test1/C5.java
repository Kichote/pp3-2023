public class C5 {
    // Attributes
    private int x;
    private int y;

    // Constructor to initialize the object's attributes
    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to check if the point is on the x-axis
    public boolean isX() {
        return y == 0;
    }

    // Method to check if the point is on the y-axis
    public boolean isY() {
        return x == 0;
    }

    // Method to represent the object as text with coordinates in the format "P(x, y)"
    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        // Sample usage
        C5 point = new C5(3, 0);

        System.out.println("isX(): " + point.isX());
        System.out.println("isY(): " + point.isY());
        System.out.println("toString(): " + point.toString());
    }
}
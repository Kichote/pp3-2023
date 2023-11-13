public class Point {
    // Attributes
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
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

    // Method to represent the object as text
    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        // Creating a point
        Point p = new Point(3, 0);

        // Using isX method
        System.out.println("isX() returns " + p.isX());

        // Using isY method
        System.out.println("isY() returns " + p.isY());

        // Using toString method
        System.out.println("toString() returns \"" + p.toString() + "\"");
    }
}
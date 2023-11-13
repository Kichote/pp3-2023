public class Rectangles {

    public int bok1;
    public int bok2;

    public Rectangles(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public String display() {
        int perimeter = bok1*2 + bok2*2;
        int surfaceArea = bok1*bok2;
        return "Rectangle dimension: " + bok1 + "x" + bok2 + "\nPerimeter of rectangle: " + perimeter
        + "\nSurface area of rectangle: " + surfaceArea;
    }

    public static void main(String[] args) {
        Rectangles rec1 = new Rectangles(3, 4);
        Rectangles rec2 = new Rectangles(2,7);
        System.out.println(rec1.display());
        System.out.println(rec2.display());
    }
}
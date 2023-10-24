public class Calculator {

    public static int biggerNumber(int a, int b) {
        return Math.max(a, b);
    }

    public static double displayPi() {
        return Math.PI;
    }

    public static double absoluteValue(double a) {
        return Math.abs(a);
    }

    public static double square(double a) {
        return Math.sqrt(a);
    }

    public static double randomNumber() {
        return Math.random();
    }

    public static int randomIntNumber(int a, int b) {
        return (int)(Math.random() * (b - a) + a);
    }

    public static double sine(double a) {
        double b = Math.toRadians(a);
        return Math.sin(b);
    }

    public static void main(String[] args) {
        System.out.println(biggerNumber(34, 49));
        System.out.println(displayPi());
        System.out.println(absoluteValue(-17));
        System.out.println(square(9/2.0));
        System.out.println(randomNumber());
        System.out.println(randomIntNumber(0, 10));
        System.out.println(sine(90));
    }
}
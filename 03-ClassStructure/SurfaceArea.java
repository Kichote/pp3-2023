public class SurfaceArea {
    
    public double areaOfCuboid(double a, double b, double c) {
        return 2*a*b + 2*a*c + 2*b*c;
    }

    public double areaOfSphere(double radius) {
        return 4*Math.PI*radius;
    }

    public double areaOfCone(double radius, double height) {
        double przeciwprostokątna = Math.sqrt((height*height) + (radius*radius));
        return (Math.PI*radius*radius) + (Math.PI*radius*przeciwprostokątna);
    }

    public static void main(String[] args) {
        SurfaceArea area = new SurfaceArea();
        System.out.println(area.areaOfCone(3, 4));
        System.out.println(area.areaOfCuboid(2, 2, 2));
        System.out.println(area.areaOfSphere(5));
    }
}

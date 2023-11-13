public class speed {
    public static int minSpeed = 40;

    public static int maxSpeed = 140;

    public String checkVehicleSpeed(int speed) {
        boolean validSpeed = false;
        if (speed >= 40 && speed <= 140) {
            validSpeed = true;
        }
        return "Vehicle speed: " + speed + "\nSpeed is valid: " + validSpeed;
    }

    public static void main(String[] args) {
        speed speed = new speed();
        System.out.println(speed.checkVehicleSpeed(39));
    }
}

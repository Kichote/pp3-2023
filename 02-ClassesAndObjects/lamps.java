public class lamps {
    
    public boolean isLampOn;

    public void turnOn( ) {
        isLampOn = true;
    }

    public void turnOff() {
        isLampOn = false;
    }

    public String display() {
        final String lamp = isLampOn == true
        ? "The lamp is on"
        : "The lamp is off";
        return lamp;
    }

    public static void main(String[] args) {
        lamps lamp = new lamps();
        lamp.turnOff();
        System.out.println(lamp.display());
    }
}

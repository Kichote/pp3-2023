public class InternetDevice {
    
    String name;
    boolean connected;
    static int connectedDevices = 0;

    public InternetDevice(String name) {
        this.name=name;
    }

    public void connect() {
        connected = true;
        connectedDevices++;
    }

    public void disconnect() {
        connected = false;
        connectedDevices--;
    }

    public boolean isConnected() {
        return connected;
    }

    public String displayStatus() {
        return "Device name: " + name + "\nIs device connected: " + connected;
    }

    public static String displayConnections() {
        return "Number of connected devices: " + connectedDevices;
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("PC");
        InternetDevice device2 = new InternetDevice("Laptop");
        InternetDevice device3 = new InternetDevice("Phone");
        InternetDevice device4 = new InternetDevice("Tablet");
        InternetDevice device5 = new InternetDevice("Smartphone");

        device1.connect();
        device2.connect();
        device3.connect();
        device1.disconnect();

        System.out.println(InternetDevice.displayConnections());
    }
}

public class HeightCalc {

    public static void main(String[] args) {
        int heightInCm = 188;

        int feet = (int)(heightInCm /30.48);
        int inches = (int)((heightInCm % 30.48)/2.54);

        System.out.println("I am " + heightInCm + "cm tall, i.e. " + feet + " feet and " + inches + " inches");
    }
}

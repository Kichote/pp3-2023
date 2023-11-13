public class height {

    public int heightInCm;

    public String calculateHeight(int heightInCm) {
        int feet = (int)(heightInCm/30.48);
        int inches = (int)((heightInCm%30.48)/2.50);
        return "I am " + heightInCm + " tall, i.e. " + feet + 
        " feet and " + inches + " inches";
    }

    public static void main(String[] args) {
        height height1 = new height();
        System.out.println(height1.calculateHeight(170));
    }
}
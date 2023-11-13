public class Calculation {

    public int numberOfItemsInRange(int x, int y) {
        return y - x + 1;
    }

    public double sumOfNumbersInRange(int x, int y) {
        int items = numberOfItemsInRange(x, y);
        int endValue = 0;
        for(int i = 0; i < items; i++) {
            endValue += x;
            x += 1;
        }
        return endValue;
    }

    public double arithmeticMeanOfNumbersInRange(int x, int y) {
        int items = numberOfItemsInRange(x, y);
        double sum = sumOfNumbersInRange(x, y);
        return sum/items;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.numberOfItemsInRange(5, 10));
        System.out.println(calculation.sumOfNumbersInRange(5, 10));
        System.out.println(calculation.arithmeticMeanOfNumbersInRange(5, 10));
    }
}

public class cantor {
    
    public double buyEuro;
    public double sellEuro;

    public String calculateSpread(double buyEuro, double sellEuro) {
        double spread = (buyEuro - sellEuro);
        if (spread < 0 ) {
            spread *= -1;
        }
        return "Bank buys EUR: " + buyEuro + "\nBank sells EUR: " + sellEuro + "\nSpread: " + spread;
    }

    public static void main(String[] args) {
        cantor cantor = new cantor();
        System.out.println(cantor.calculateSpread(4.5940, 4.6250));
    }
}

public class Counter {
    
    public int value = 0;

    public void increaseBy1() {
        value += 1;
    }

    public void decreaseBy1() {
        value -= 1;
    }

    public void increaseBy10() {
        value += 10;
    }

    public void decreaseBy10() {
        value -= 10;
    }

    public void resetCounter() {
        value = 0;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increaseBy10();
        c1.increaseBy10();
        c1.increaseBy1();
        c1.increaseBy1();
        c1.increaseBy1();
        c2.decreaseBy10();
        c2.decreaseBy10();
        c2.decreaseBy10();
        c2.decreaseBy10();
        c2.decreaseBy10();
        c2.increaseBy1();
        c2.increaseBy1();
        c2.increaseBy1();
        System.out.println(c1.value +"\n" + c2.value);
    }
}

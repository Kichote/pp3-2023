public class Clock {
    // Attributes
    private int hour;
    private int minute;

    // Constructor
    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    // Accessor method for hour
    public int getHour() {
        return hour;
    }

    // Modifier method for hour
    public void setHour(int hour) {
        // Ensure hour is in the valid range (0 to 23)
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Error: Hour must be between 0 and 23.");
        }
    }

    // Accessor method for minute
    public int getMinute() {
        return minute;
    }

    // Modifier method for minute
    public void setMinute(int minute) {
        // Ensure minute is in the valid range (0 to 59)
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Error: Minute must be between 0 and 59.");
        }
    }

    // Method to move the clock forward by one minute
    public void addMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour = (hour + 1) % 24;
        }
    }

    public static void main(String[] args) {
        // Creating a clock
        Clock myClock = new Clock(10, 30);

        // Displaying initial time
        System.out.println("Initial Time: " + myClock.getHour() + ":" + myClock.getMinute());

        // Using addMinute method
        myClock.addMinute();

        // Displaying updated time
        System.out.println("Updated Time: " + myClock.getHour() + ":" + myClock.getMinute());
    }
}
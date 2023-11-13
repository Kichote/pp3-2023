public class clock {
    
    public int hours;

    public int minutes;

    public String time(int hours, int minutes) {
        String time = hours + ":" + minutes;
        int minutesFromMidnight = (23 - hours)*60 + (60 - minutes);
        int secondsFromMidnight = minutesFromMidnight*60;
        if (hours > 23) {
            return "Number of hours above 23";
        }

        if (hours < 0) {
            return "Number of hours is negative";
        }

        if (minutes > 59) {
            return "Number of minutes above 59";
        }

        if (minutes < 0) {
            return "Number of minutes is negative";
        }

        if (minutes == 0 || minutes == 00) {
            time = hours + ":00";
        }
        return "hours = " + hours + "\nminutes = " + minutes + "\ntime: " + time 
        + "\nminutes from midnight: " + minutesFromMidnight 
        + "\nseconds from midnight: " + secondsFromMidnight;
    }

    public static void main(String[] args) {
        clock clock = new clock();
        System.out.println(clock.time(10, 00));
    }
}

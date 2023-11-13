public class Clock {

    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    Clock() {
        this.hour = 00;
        this.minute = 00;
    }

    Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(int hour, int minute) {
        this.minute = minute;
        this.hour = hour;
    }

    public void setClock() {
        this.minute = 0;
        this.minute = 0;
    }

    public String displayTime() {
        if (hour < 10 && hour >= 0 && minute >= 10 && minute < 60) {
            return "0" + hour + ":" + minute;
        }

        if (hour < 10 && hour >= 0 && minute < 10 && minute >= 0) {
            return "0" + hour + ":0" + minute;
        }

        if (hour > 10 && hour < 24 && minute < 10 && minute >=0) {
            return hour + ":0" + minute;
        }

        if (hour > 24 || minute > 60 || hour < 0 || minute < 0) {
            return "Wrong numbers were used in clock initiazlization";
        }
        return hour + ":" + minute;
    }

    public void addOneMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }

        if (alarmHour == hour && alarmMinute == minute) {
            System.out.println(runAlarm());
        }
    }

    public void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    public String runAlarm() {
        return "beep-beep-beep-beep !!";
    }

    public void alarm() {

    }

    public static void main(String[] args) {
        Clock clock = new Clock(12, 47);
        System.out.println(clock.displayTime());
        clock.setClock(18, 14);
        System.out.println(clock.displayTime());
        clock.setClock(9, 03);
        System.out.println(clock.displayTime());
        clock.setClock(23, 58);
        clock.setAlarm(23, 59);
        System.out.println(clock.displayTime());
        clock.addOneMinute();
        System.out.println(clock.displayTime());
        clock.addOneMinute();
        System.out.println(clock.displayTime());
        clock.addOneMinute();
        System.out.println(clock.displayTime());
    }
}
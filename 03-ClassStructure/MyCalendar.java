public class MyCalendar {
    
    static int year = 2023;
    static int month = 11;
    static int day = 2;

    public static String myDate(int year, int month, int day) {
        if(month < 10 && day < 10) {
            return "Date: " + year + "-0" + month + "-0" + day;
        }
        else if(month < 10 && day > 10) {
            return "Date: " + year + "-0" + month + "-" + day;
        }
        else if(month > 9 && day < 10) {
            return "Date: " + year + "-" + month + "-0" + day;
        }
        return "Date: " + year + "-" + month + "-" + day;
    }

    public static String days(int month, int day) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        int days = 0;
        for(int i = month - 1; i >= 1; i--) {
            days += daysInMonth[i - 1];
        }
        int passedDays = days + day;
        return "Days passed since new year: " + passedDays;
    }

    public static String monthName(int month) {
        String[] monthNames = {"styczen", "luty", "marzec", "kwiecien", "maj", "czerwiec", "lipiec", "sierpien", "wrzesien", "pazdziernik", "listopad", "grudzien"};
        return "Month name: " + monthNames[month - 1];
    }

    public static void main(String[] args) {
        System.out.println(myDate(year, month, day));
        System.out.println(days(month, day));
        System.out.print(monthName(month));
    }
}
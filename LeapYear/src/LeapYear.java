public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean LeapYear = false;
        if (year < 1 || year > 9999) {
            LeapYear = false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    LeapYear = true;
                } else {
                    LeapYear = false;
                }
            } else {
                LeapYear = true;
            }
        } else {
            LeapYear = false;
        }
        return LeapYear;
    }
}

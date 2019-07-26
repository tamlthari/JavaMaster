public class getDaysInMonth {

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

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else if (isLeapYear(year) == true) {
            int daysInMonth = 31;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = (int) 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = (int) 30;
                    break;
                case 2:
                    daysInMonth = (int) 29;
                    break;

            return daysInMonth;
            }

        } else if (isLeapYear(year) == false) {
            int daysInMonth = 31;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = (int) 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = (int) 30;
                    break;
                case 2:
                    daysInMonth = (int) 28;
                    break;
            return daysInMonth;
            }
        }
    }
}

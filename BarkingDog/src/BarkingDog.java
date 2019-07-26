public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean should = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            should = false;
        } else if (barking == false) {
            should = false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            should = true;
        } else {
            should = false;
        }
        return should;
    }
}

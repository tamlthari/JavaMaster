public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numone, double numtwo) {
        boolean result = false;
        if (Math.abs((numone * 1000) - (numtwo * 1000)) < 1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

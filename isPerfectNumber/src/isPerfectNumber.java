public class PerfectNumber {
    // write your code here
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int factor = 1;
        int rfactors = 0;
        while (factor < number) {
            if (number % factor == 0) {
                rfactors += factor
            }
            factor++;
        }
        if (factor == number) {
            return true;
        }

        return false;

    }
}
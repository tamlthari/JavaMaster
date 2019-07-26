public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number <0){

            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {

            if ((number / 10) == 0){
                firstDigit = number;
            }

            number /= 10;


        }
        return firstDigit + lastDigit;
    }


}
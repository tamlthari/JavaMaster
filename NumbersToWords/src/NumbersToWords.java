public class NumbersToWords {
    public static void numberToWords(int number) {
        int revNumber = reverse(number);
        if(number==0){
            System.out.println("Zero");
        }
        else if (number >= 0) {
            for (int i = 0; i <= getDigitCount(number); i++)
                while (number != 0) {
                    int d1 = revNumber % 10;
                    switch (d1) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    revNumber /= 10;
                    number /= 10;
                }
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static int getDigitCount(int number){
        if (number<0)
            return -1;
        if (number==0)
            return 1;
        int digitCount=0;
        int lastDigit=0;
        while (number>=1){
            number/=10;
            digitCount++;
        }
        return digitCount;
    }
    public static int reverse(int number){
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber =reverseNumber* 10 + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

}
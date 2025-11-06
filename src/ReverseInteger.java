public class ReverseInteger {
    // % modulus gives the remainder
    // / divide gives the quotient

    public static void main(String[] args){
        int number = 120;
        int reverseNum = 0;
        int lastDigit = 0;

        while(number!=0){
            lastDigit = number%10;
            //check for overflow
            if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum == Integer.MAX_VALUE /10){
                System.out.println(0);
                System.exit(0);
            }
            //check for underflow
            if (reverseNum < Integer.MIN_VALUE / 10 || reverseNum == Integer.MIN_VALUE /10){
                System.out.println(0);
                System.exit(0);
            }
            reverseNum = reverseNum*10+lastDigit;
            number = number/10;
        }
        System.out.println("reverse number : "+reverseNum);
    }
}

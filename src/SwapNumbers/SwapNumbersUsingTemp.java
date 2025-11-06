package SwapNumbers;

public class SwapNumbersUsingTemp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(String.format("a=%d and b=%d",a,b));
    }
}

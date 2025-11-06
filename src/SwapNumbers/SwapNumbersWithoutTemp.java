package SwapNumbers;

public class SwapNumbersWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a+b; //30
        b = a-b; //10
        a = a-b; //20

        System.out.println(String.format("a=%d and b=%d",a,b));
    }
}

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 50;
        BigInteger x = BigInteger.ONE;
        while(n!=0){
            x = x.multiply(BigInteger.valueOf(n));
            n=n-1;
        }
        System.out.println(x);
    }
}

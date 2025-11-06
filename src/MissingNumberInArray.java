import java.util.Arrays;
import java.util.OptionalInt;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int a[]={2,4,3,5,8,6};
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];

        int actual_sum = 0;
        int expected_sum = 0;

        while(max>=min){ //max =6, min =1
            expected_sum = expected_sum + max; //sum=6 //sum=11
            max = max-1; //6 //5 //4
        }
        System.out.println("Expected sum : "+expected_sum);
        for(int i:a){
            actual_sum = actual_sum+i;
        }
        System.out.println("Actual sum : "+actual_sum);

        System.out.println("missing number : " + (expected_sum-actual_sum));
    }
}

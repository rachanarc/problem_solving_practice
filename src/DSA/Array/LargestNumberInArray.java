package DSA.Array;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int arr[] = {101,4,2,35,32,100};
        int large = 0;
        for(int i:arr){
            if(i>large){
                large = i;
            }
        }
        System.out.println("Largest in array : "+large);
    }
}

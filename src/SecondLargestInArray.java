public class SecondLargestInArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,6,7,7,8,8,5,6};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i:a){
            if(i >largest){
                second_largest = largest;
                largest = i;
            } else if ( i > second_largest && i!=largest) {
                second_largest= i;
            }
        }
        System.out.println("second largest : "+second_largest);
    }
}

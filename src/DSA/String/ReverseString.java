package DSA.String;

public class ReverseString {

    //Given string "tony"
    //expected string "ynot"
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2;i++){
            System.out.println("loop number: "+i);
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            System.out.println("1st : "+sb);
            sb.setCharAt(back, frontChar);
            System.out.println("2nd : "+sb);
        }
        System.out.println(sb);
    }

    //time complexity : O(n)
    //space complexity : O(1)
}

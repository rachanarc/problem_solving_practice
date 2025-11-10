package DSA.String;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //insert
        sb.insert(1,"t");
        System.out.println(sb);

        //delete the 's'
        sb.delete(0,1);
        System.out.println(sb); //tony

        sb.delete(2,3);
        System.out.println(sb);

        //append : new string is not created, same memory in heap is modified
        sb.append("s");//toys
        System.out.println(sb);

        System.out.println(sb.length());
    }
}

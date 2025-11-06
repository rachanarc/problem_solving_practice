public class LengthOfLastWord {
    public static void main(String[] args) {
        String s1 = "        Hello          Worldly        ";
        //String s1 = s.trim(); //removes the extra spaces in the beginning and end
        int wordcount = 0;

        char inputArray[] = s1.toCharArray();
        for(int i =inputArray.length-1;i>=0;i--){
            if(inputArray[i]!=' '){
                wordcount = wordcount+1;
            }
            else {
                //this is required if you are not allowed to trim method
                if(wordcount>0) {
                    System.out.println("wordcount : " + wordcount);
                    System.exit(0);
                }
            }
        }
    }
}

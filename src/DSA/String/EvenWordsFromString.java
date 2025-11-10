package DSA.String;

public class EvenWordsFromString {

    public static void main(String[] args) {
        String s = "sky is blue and vast";
        int count = 0;

        String words[] = s.split(" ");
        for(int i=0;i< words.length;i++){
            if(words[i].length()%2 == 0){
                count = count+1;
            }
        }
        System.out.println("count : "+count);

        for(String word : words){
            if(word.length()%2==0){
                System.out.println("word with even length: "+word);
            }
        }
    }
}

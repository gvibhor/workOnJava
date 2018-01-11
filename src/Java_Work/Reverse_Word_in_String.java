package Java_Work;
public class Reverse_Word_in_String {
    public static void main(String[] args) {
        String str="Hello guys.. How are you.?";
        String word[]=str.split(" ");
        for(int i=word.length-1;i>=0;i--)
        {
            for(int j=word[i].length()-1;j>=0;j--)
            {
                System.out.print(word[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
    
}

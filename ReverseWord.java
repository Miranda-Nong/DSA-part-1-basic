import java.util.Scanner;

public class ReverseWord {
    
    // Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // Split the string into words
        String word[] = S.split("\\.");
        String revString ="";
        
        // Loop through the words array in reverse order
        for (int i = word.length - 1; i >= 0; i--) {
            revString = revString +word[i];
            if (i>0) {
                revString = revString+".";
            }
        }
        
        // Convert StringBuilder to String
        return revString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence with . in between the words");
        String sentence = sc.nextLine();
        String result = ReverseWord.reverseWords(sentence);
        System.out.println(result);
    }
}

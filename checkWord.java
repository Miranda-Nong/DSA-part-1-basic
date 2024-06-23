import java.util.*;

public class checkWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        System.out.println("Enter your word");
        String word = sc.nextLine();


        boolean isWordPresent = sentence.contains(word);
        
        if(isWordPresent){
            System.out.println("The word " + word + " is present in the sentence");       
        }
        else{
            System.out.println("The word " + word + " is not present in the sentence");
        }
    }
}

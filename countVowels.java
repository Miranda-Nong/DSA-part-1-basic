import java.util.*;

public class countVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels=0, consonant=0;

        System.out.println("Enter the string");
        String str = sc.nextLine();

        char strChar[] = str.toCharArray();

        for(int i=0; i<strChar.length; i++){
            if(strChar[i] == 'a'||strChar[i] == 'e'||strChar[i] == 'i'||strChar[i] == 'o' || strChar[i] == 'u'
            ||strChar[i] == 'A'||strChar[i] == 'E' ||strChar[i] == 'I'||strChar[i] == 'O'||strChar[i] == 'U'){
                vowels=vowels+1;
            }
            else
                consonant = consonant+1;
        }
        System.out.println("The number of vowels is "+ vowels + " and number of consonant is "+consonant);
    }
}
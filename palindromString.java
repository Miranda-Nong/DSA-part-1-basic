import java.util.*;

public class palindromString {

    public static void palindromCheck(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        palindromCheck(str);

    }
}

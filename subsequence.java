import java.util.Scanner;

public class subsequence {
    public static void substrings(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);

        substrings(str, idx+1, newString+currChar);     //to be

        substrings(str, idx+1, newString);              //not to be
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        substrings(str, 0, "");
    }
}

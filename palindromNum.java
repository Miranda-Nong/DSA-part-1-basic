import java.util.*;

public class palindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int temp,rev=0,remainder;
        int num = sc.nextInt();
        temp=num;
        while(num!=0){
            remainder = temp%10;
            rev = rev + remainder;
            temp = temp/10;
        }
        if(num==temp)
            System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");



    }
}

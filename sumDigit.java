import java.util.*;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while(num>0){
            int rem = num % 10;
            sum = sum + rem;
            num= num/10;
        }
        System.out.println("The sum of the digits is "+ sum);
    }
}

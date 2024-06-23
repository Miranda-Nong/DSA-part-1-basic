import java.util.*;

public class sqSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the no. of numbers");
        int n =sc.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int sq = num*num;
            sum = sum + sq;
        }
        System.out.println("The sum of Square sum of th n natural number is "+ sum);

    }
}

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of number");
        int n = sc.nextInt();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int sum=0;

        //or to find the length of number we can do as int n = String.valueOf(num).length();
        //have to convert to string first coz int do not support length function
        
        while(temp>0){
            int rem = temp % 10;
            sum = sum + (int)Math.pow(rem,n);
            temp = temp /10;
        }
        if(sum==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");

        }
    }
}

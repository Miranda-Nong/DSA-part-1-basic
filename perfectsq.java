import java.util.*;

public class perfectsq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Invalid Number");
        }
        int sqrt=(int)Math.sqrt(num);

        if(sqrt*sqrt == num){
            System.out.println("Perfect Square");
        }
        else
            System.out.println("Not perfect square");
    }
}

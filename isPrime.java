import java.util.Scanner;

public class isPrime {
    public static boolean PrimeCheck(int number){
        if(number <=1){
            return false;
        }
        for(int i =2; i<=number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();

        boolean value = PrimeCheck(number);
        if(value){
            System.out.println(number +" is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}

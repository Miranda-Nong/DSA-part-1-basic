import java.util.*;

public class counting{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[],even=0,odd=0;
        System.out.println("Enter the size of array");
        int arr_size=sc.nextInt();
        arr = new int[arr_size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr_size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr_size;i++){
            if(arr[i]%2==0)
                even=even+1;
            else
                odd=odd+1;
        }
       System.out.println("Number of even number is "+ even + " and number of odd number is "+ odd + " in the array");

    }
}
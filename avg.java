import java.util.*;

public class avg{
    public static void main(String[] args) {
        int arr[], arr_size,Elementsum=0,avgvalue=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        arr_size = sc.nextInt();
        arr =  new int[arr_size];
        System.out.println("Enter the elements of array");
        for(int i =0; i<arr_size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr_size; i++){
            Elementsum=Elementsum+arr[i];
        }
        avgvalue = Elementsum/arr_size;
        System.out.println("The average of the array is "+ avgvalue);
    }
}
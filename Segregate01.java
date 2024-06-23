import java.util.Scanner;

public class Segregate01 {

    public static void segregate(int arr[], int n){
        int count = 0; //count the nos of zeros in arr
        for(int i =0; i<n; i++){
            if(arr[i]==0)
                count++;
        }
        for(int i = 0; i<count; i++){
            arr[i] = 0;
        }
        for(int i = count; i<n; i++){
            arr[i] = 1;
        }
    }
    public static void print(int arr[],int n){
        System.out.println("Array after segregation of 0s and 1s is ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements 0s and 1s");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        segregate(arr, n);
        print(arr, n);
    }
}

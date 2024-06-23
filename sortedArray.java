import java.util.*;

public class sortedArray {

    static boolean arraySorted(int arr[], int n){
        if(n ==0  || n==1)
            return true;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

    public static void sorting(int arr[], int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            n = sc.nextInt();
        }
        if(arraySorted(arr, n)){
            System.out.println("Yes, sorted array");
        }
        else{
            System.out.println("not Sorted array, and the sorted array will be");
            sorting(arr,n);
        }
    }
}

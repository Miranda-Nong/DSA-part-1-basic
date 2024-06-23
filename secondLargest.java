public class secondLargest {
    static void print2largest(int arr[], int arr_size){
        int i , second;

        if(arr_size<2){                 //there should be atleast two elements
            System.out.println("Invalid input");
            return;
        }
        int largest = second = Integer.MIN_VALUE;

        for(i = 0;i<arr_size; i++){         //finding largest
            largest = Math.max(largest,arr[i]);
        }

        for(i=0;i<arr_size;i++){            //finding 2nd largest
            if(arr[i]!=largest){
                second = Math.max(second, arr[i]);
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("There is no second largest elements");
        }
        else{
            System.out.println("The second largest element is "+ second);
        }
    }

    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int n=arr.length;

        print2largest(arr, n);
    }
}

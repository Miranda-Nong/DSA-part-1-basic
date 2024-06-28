import java.util.Scanner;

public class returnAddress {
    public static int[] target(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        System.out.println("No match found");
        return null;  // return null if no match is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int arr_size = sc.nextInt();
        
        int arr[] = new int[arr_size];

        System.out.println("Enter the elements");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target");
        int target = sc.nextInt();

        int[] result = target(arr, target);
        if (result != null) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        }
    }
}

import java.util.*;

public class matrixElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue=Integer.MIN_VALUE, matrix[][];
        System.out.println("Enter the no. of row in matrix");
        int row = sc.nextInt();
        System.out.println("Enter the no. of column in matrix");
        int col =sc.nextInt();

        matrix = new int[row][col];

        System.out.println("Enter the elements of the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
                   
            }
        }
        System.out.println("Maximum value in the matrix is "+ maxValue);
    }
}

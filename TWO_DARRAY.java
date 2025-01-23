import java.util.Scanner;

public class TWO_DARRAY {
    public static void main(String[]args){
        Scanner myObj = new Scanner (System.in);
        int[][] array = new int[10][10];

         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 System.out.print("Enter a value for index [" + i + "][" + j + "]: ");
                 array[i][j] = myObj.nextInt();
             }
         }
         System.out.println("2D Array values: ");
         for (int[] row : array) {
             for (int value : row) {
                 System.out.print(value + " ");
             }
             System.out.println();
         }
    }
}
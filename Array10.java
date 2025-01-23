import java.util.Scanner;

public class Array10 {

    public static void main(String[] args) {
        // Declare an array of length 10
        int[] array = new int[10];

        // Create a Scanner object to accept input from the user
        Scanner input = new Scanner(System.in);

        // Loop to take input for each element in the array
        for (int i = 0; i < array.length; i++) {
            // Prompt the user to input a value for the element at index i
            System.out.println("Enter a value for element at index [" + i + "]: ");
            array[i] = input.nextInt();  // Read the user's input
        }

        // Print the elements of the array using a for-each loop
        System.out.println("\nEntered elements in the array are:");
        for (int element : array) {
            System.out.print(element + " ");  // Print each element with a space
        }

    }
}

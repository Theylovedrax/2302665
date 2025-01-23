public class NigerianFlagSingleLoop2 {

    public static void main(String[] args) {
        // Number of rows and columns in the flag
        int rows = 6;
        int columns = 9;  // Last column removed, so now we have 9 columns

        // Single loop to print the flag
        for (int i = 0; i < rows; i++) {
            // Loop for printing the pattern in a row
            for (int j = 0; j < columns; j++) {
                if (i < 3) {
                    // In the first 3 rows, first 4 columns are '*' (green)
                    if (j < 4) {
                        System.out.print("* ");
                    }
                    // The next 5 columns are '=' (white)
                    else {
                        System.out.print("= ");
                    }
                } else {
                    // In the last 3 rows, first 5 columns are '=' (white)
                    if (j < 5) {
                        System.out.print("= ");
                    }
                    // The next 4 columns are '=' (green)
                    else {
                        System.out.print("= ");
                    }
                }
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}

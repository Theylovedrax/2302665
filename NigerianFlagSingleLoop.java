public class NigerianFlagSingleLoop {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 12;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3) {
                    System.out.print("* ");
                } else if (j < 2 * columns / 3) {
                    System.out.print("= ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
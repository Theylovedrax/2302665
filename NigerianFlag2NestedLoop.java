public class NigerianFlag2NestedLoop {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            if(i < 3) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("* ");
                }
                for (int j = 0; j < 7; j++) {
                    System.out.print("= ");
                }
            } else {
                for (int j = 0; j < 11; j++){
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}

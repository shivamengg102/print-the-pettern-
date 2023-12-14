/**
 * prectice5
 */
public class prectice5 {

    public static void main(String[] args) {
        int n = 5;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {

                int sum = i + j;

                if (sum % 2 == 0) { // ODD
                    System.out.print("0 ");
                } else { // EVAN
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();

        int temp = 0, Sum = 0;

        for (int i = 1; i <= n; ++i, temp = 0) {
            for (int space = 1; space <= (n - i); ++space) {
                System.out.print("  ");
            }
            while (temp != (2 * i - 1)) {
                System.out.print("* ");
                Sum += 1;
                ++temp;
            }
            System.out.println();
        }
        System.out.print(Sum);
    }
}

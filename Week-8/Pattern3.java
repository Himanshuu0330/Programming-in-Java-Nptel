import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        int flage = 1, sum_is = 0;
        for (int c = 1; c <= n; ++c, flage = 1) {
            for (int space = 1; space <= n - c; ++space) {
                System.out.print("  ");
            }
            while (flage <= 2 * c - 1) {
                System.out.print(flage + " ");
                sum_is += flage;
                ++flage;
            }
            System.out.println();
        }
        System.out.print(sum_is);
    }
}

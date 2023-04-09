import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int l = inr.nextInt();
        int UperL = 0;
        int lowerl = 0;

        if (l % 2 != 0) {
            UperL = (l / 2) + 1;
            lowerl = l - UperL;

            for (int d = 1; d <= UperL; d++) {

                for (int s = 1; s <= (UperL - d); s++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= d; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            int c = lowerl;
            for (int p = 1; p <= lowerl; p++) {

                for (int s = c; s < lowerl; s++) {
                    System.out.print(" ");
                }

                for (int q = 1; q - 1 <= lowerl - p; q++) {
                    System.out.print(" *");
                }
                c--;
                System.out.println();
            }
        } else {
            System.out.print("Invalid line number");
        }
    }
}

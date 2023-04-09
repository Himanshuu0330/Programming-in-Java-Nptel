import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int l = inr.nextInt();
        int e, c;
        int space = l - 1;

        for (e = 0; e < l; e++) {

            for (c = 0; c < space; c++) {
                System.out.print(" ");
            }
            for (c = 0; c <= e; c++) {
                System.out.print("* ");
            }

            System.out.print("\n");
            space--;
        }
    }
}

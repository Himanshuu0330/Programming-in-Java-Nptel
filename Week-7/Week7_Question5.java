import java.util.*;

public class Week7_Question5 {
    public static void main(String[] args) {
        try {
            String s1 = "NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c = 'a';

            byte[] b = s1.getBytes();
            byte B = (byte) c;
            b[n] = B;
            System.out.print(new String(b));
        } catch (Exception e) {
            System.out.println("exception occur");
        }
    }
}

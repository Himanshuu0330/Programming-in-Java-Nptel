import java.io.*;

public class Week7_Question2 {
    public static void main(String args[]) {
        try {
            InputStreamReader y = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(y);
            String number = b.readLine();
            int n = Integer.parseInt(number);
            System.out.print(n * n);
        } catch (Exception e) {
            System.out.print("Please enter valid data");
        }
    }
}

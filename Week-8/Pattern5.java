import java.util.*;

public class Pattern5 {
    public static void main(String[] args) throws Exception {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        printDigit(n);
    }

    private static final Map<Integer, Integer> end = new HashMap<Integer, Integer>();
    static {
        end.put(0, 0x7E);
        end.put(1, 0x30);
        end.put(2, 0x6D);
        end.put(3, 0x79);
        end.put(4, 0x33);
        end.put(5, 0x5B);
        end.put(6, 0x5F);
        end.put(7, 0x70);
        end.put(8, 0x7F);
        end.put(9, 0x7B);
    }

    public static void printDigit(int digit) {
        int code = encode(digit);
        char[] bits = String.format("%7s", Integer.toBinaryString(code))
                .replace(' ', '0').toCharArray();

        lightSegmentArrange(bits[0] == '1', " _ \n", "   \n");
        lightSegmentArrange(bits[5] == '1', "|", " ");
        lightSegmentArrange(bits[6] == '1', "_", " ");
        lightSegmentArrange(bits[1] == '1', "|\n", " \n");
        lightSegmentArrange(bits[4] == '1', "|", " ");
        lightSegmentArrange(bits[3] == '1', "_", " ");
        lightSegmentArrange(bits[2] == '1', "|\n", " \n");
    }

    private static void lightSegmentArrange(boolean on, String onValue, String offValue) {
        System.out.print(on ? onValue : offValue);
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int encode(int digit) {
        return end.containsKey(digit) ? end.get(digit) : 0x00;
    }
}

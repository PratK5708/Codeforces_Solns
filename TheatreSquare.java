import java.util.Scanner;

public class TheatreSquare {
    public long pave(long n, long m, long a) {
        long x = (long) Math.ceil((double) m / a);
        long y = (long) Math.ceil((double) n / a);
        return x * y;
    }

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        long n = abc.nextLong();
        long m = abc.nextLong();
        long a = abc.nextLong();
        TheatreSquare obj = new TheatreSquare();
        System.out.println(obj.pave(n, m, a));
    }
}

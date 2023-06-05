import java.util.Scanner;

public class TheGoodArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int mn = n;

            for (int i = 1; i <= n; i++) {
                int l = (i + k - 2) / k;
                int r = (n - i + k - 1) / k;
                mn = Math.min(mn, l + r);
            }
            System.out.println(mn + 1);
        }
    }
}

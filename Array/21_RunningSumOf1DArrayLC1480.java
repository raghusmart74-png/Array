import java.util.*;

public class Array1D_21_RunningSumOf1DArrayLC1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = a[i] + a[i - 1];
        }
        for (int x : a) System.out.print(x + " ");
    }
}

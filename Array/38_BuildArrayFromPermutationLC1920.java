import java.util.*;

public class Array1D_38_BuildArrayFromPermutationLC1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = a[a[i]];
        }
        for (int x : ans) System.out.print(x + " ");
    }
}

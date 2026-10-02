import java.util.*;

public class Array1D_18_MajorityElementLC169Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[n / 2]);
    }
}

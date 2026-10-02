import java.util.*;

public class Array1D_36_CreateTargetArrayInTheGivenOrderLC1389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n], index = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        for (int i = 0; i < n; i++) index[i] = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(index[i], nums[i]);
        }
        for (int x : a) System.out.print(x + " ");
    }
}

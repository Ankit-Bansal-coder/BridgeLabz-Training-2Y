import java.util.*;
public class SubarrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        Set<Integer> set = new HashSet<>();
        int sum=0;
        boolean found=false;
        for (int x: arr) {
            sum+=x;
            if (sum==0 || set.contains(sum)) { found=true; break; }
            set.add(sum);
        }
        System.out.println(found);
    }
}
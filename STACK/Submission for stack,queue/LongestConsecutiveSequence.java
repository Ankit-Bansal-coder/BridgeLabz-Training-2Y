import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        Set<Integer> set=new HashSet<>();
        for (int x: arr) set.add(x);
        int longest=0;
        for (int x: arr) {
            if (!set.contains(x-1)) {
                int curr=x, count=1;
                while (set.contains(curr+1)) { curr++; count++; }
                longest=Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }
}
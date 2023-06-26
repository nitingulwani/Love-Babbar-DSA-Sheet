
import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      for(int i = 0; i<n; i++){
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);
      }
      int sum = min + max;
      return sum;
  }
}

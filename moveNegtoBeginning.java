public class Solution {
    public static int[] separateNegativeAndPositive(int[] a) {
        int si = 0;
        int ei = a.length - 1;

        while (si < ei) {
            if (a[si] < 0 && a[ei] > 0) {
                si++;
                ei--;
            } 
            else if (a[si] < 0 && a[ei] < 0) {
                si++;
            } 
            else if (a[si] > 0 && a[ei] > 0) {
                ei--;
            } 
            else if (a[si] > 0 && a[ei] < 0) {
                int temp = a[si];
                a[si] = a[ei];
                a[ei] = temp;
                si++;
                ei--;
            }
        }
        return a;
    }
}

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		Collections.sort(arr);

		int smallK = arr.get(k-1);
		int largeK = arr.get(n-k);

		ans.add(smallK);
		ans.add(largeK);

		return ans;
	}
}

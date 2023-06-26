import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] nums)
    {
        //Write your code here
        int si = 0;
        int ei = nums.length-1;
        int ind = 0;

        while(ind<=ei && si<ei){
           if(nums[ind] == 0){
               nums[ind] = nums[si];
               nums[si] = 0;
               ind++;
               si++;
           } 
           else if(nums[ind] == 2){
               nums[ind] = nums[ei];
               nums[ei] = 2;
               ei--;
            }
            else if(nums[ind] == 1){
                // si++;
                ind++;
            }
        }
        return;
        
        }
    }

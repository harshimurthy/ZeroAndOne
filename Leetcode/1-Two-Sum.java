import java.io.*;
class 1-Two-Sum
public class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length();i++)
        {
            for(int j=0;j<nums.length();j++)
            {
                if((nums[i]+nums[j])==target)
                    return i,j;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new 
    }
}
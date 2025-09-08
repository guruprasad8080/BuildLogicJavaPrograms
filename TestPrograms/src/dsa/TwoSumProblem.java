package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Question: Given an array of integers and a target value, return the indices of the two numbers that add up to the target.
Example:
Input: numbs = [2, 7, 11, 15], target = 9
Output: [0, 1] (because 2 + 7 = 9)
→ Topic: Arrays, HashMap*/
public class TwoSumProblem {

    public static void main(String[] args) {
        int[] nums={2,5,11,15};
        int target= 9;
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

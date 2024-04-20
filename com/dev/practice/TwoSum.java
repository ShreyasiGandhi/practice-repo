package com.dev.practice;
import java.util.HashMap;
import java.util.Map;
/*
LLETCODE EASY QUESTION: Question #10
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
 Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) 
    {
      if (numToIndex.containsKey(target - nums[i]))
       return new int[] {numToIndex.get(target - nums[i]),i};
          
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
    public static void main(String[] args) {
        TwoSum ts=new TwoSum();
        int [] nums={1,2,3,4,5,9};
        int[] res = ts.twoSum(nums, 11);
        System.out.println("Indices of the two numbers whose sum is equal to target:");
        System.out.println("Index 1: " + res[0]);
        System.out.println("Index 2: " + res[1]);
    }
}  

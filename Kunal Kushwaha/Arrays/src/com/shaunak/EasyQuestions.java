package com.shaunak;

public class EasyQuestions {

    public int[] buildArray(int[] nums) {
        //https://leetcode.com/problems/build-array-from-permutation/
        //Sanity Check
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i]= nums[nums[i]];
        }

        return ans;
    }

    public int[] getConcatenation(int[] nums) {
        //https://leetcode.com/problems/concatenation-of-array/
        //Sanity Check
        int i=0;
        int j=0;
        int n=nums.length;
        int[] ans = new int[2*n];

        while(i<n){
            ans[i]=nums[i];
            i++;
        }

        while(i< 2*n){
            ans[i]=nums[j];
            i++;
            j++;
        }

        return ans;
    }

    public int[] runningSum(int[] nums) {
        //https://leetcode.com/problems/running-sum-of-1d-array/submissions/
        //Sanity Check, but same question can be done in O(1) space to make it tougher.
        int i=0;

        for(i=1; i<nums.length; i++){
            nums[i]= nums[i] + nums[i-1];
        }

        return nums;

    }

    public int[] shuffle(int[] nums, int n) {
        //https://leetcode.com/problems/shuffle-the-array/
        //Between Sanity Check & Easy, but if it is to be done in O(1) space, becomes tough
        int[] arr2 = new int[2*n];

        int i=0;
        int j=n;
        int k=0;

        while(i<n){
            arr2[k] = nums[i];
            arr2[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }

        return arr2;
    }

}

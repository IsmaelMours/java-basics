package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String [] args){

        int [] num1 ={};
        int [] num2 ={1};
        int [] num = {2, 7, 11, 15};
        int target = 9;

        System.out.println(findMedianSortedArrays(num1, num2));

    }
    public static int[] twoSum(int[] nums, int target) {


        int[] results = new int [2];
        for(int i = 0; i < nums.length -1; i++){

            for(int k = i +1; k < nums.length - 1; k++)
            {
                if(nums[i] + nums[k] == target ){

                    results[0] = i;
                    results[1] = k;
                }
            }
        }

        return results;
    }

    // Median of Two Sorted Arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int mergeLength = nums1Length + nums2Length;
        int[] merge = new int[mergeLength];

        // Merge the arrays
        System.arraycopy(nums1, 0, merge, 0, nums1Length);
        System.arraycopy(nums2, 0, merge, nums1Length, nums2Length);

        // Sort the merged array
        Arrays.sort(merge);

        // Calculate the median
        if (mergeLength % 2 == 0) {
            int mid1 = merge[mergeLength / 2 - 1];
            int mid2 = merge[mergeLength / 2];
            return (mid1 + mid2) / 2.0;
        } else {
            return merge[mergeLength / 2];
        }
    }

}




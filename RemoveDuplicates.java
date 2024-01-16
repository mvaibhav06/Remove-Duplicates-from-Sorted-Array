package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 1;
		
		while(i<nums.length && j<nums.length) {
			if(nums[i] == nums[j]) {
				j++;
			}else {
				i++;
				nums[i] = nums[j];
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		return i+1;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}
}

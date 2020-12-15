package leetcode18;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		
		int target = 0;
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		System.out.println("Target: " + target);
		
		Find4Sum solution = new Find4Sum();
		
		System.out.println("Solution: " + solution.fourSum(nums, target));
	}
}

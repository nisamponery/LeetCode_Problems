package EasyProblems;

import java.util.Arrays;

public class TwoSum {
	
	public static void main (String [] args){
		
		int target =9;
		
		int[] num = {2,7,11,15};
		
		twoSums(num, target);
	}
	
public static int[] twoSums(int[] nums, int target) {
        
        
        int [] solution = new int [2];
		int temp = -1;
		
		if (nums == null || nums.length < 2) {
			
			return null;
		}
		
		if (nums.length ==2) {
			
		if (nums[0] + nums[1] == target){
			solution [0] = 	0;
			solution [1] =	1;
			return solution;
			}
		}
		
		for (int i =0 ; i< nums.length;i++){
			
			temp = nums[i];
			
			for(int j = i+1; j<nums.length;j++){
				
				if (temp + nums[j] == target) {
					
					solution [0] = 	i;
					solution [1] =	j;
					System.out.println("result = "+ Arrays.toString(solution));
					return solution;
				}
				
			}
			
		}
		
		
		
		
		
		// rember to change
		return null;
        
    }

}

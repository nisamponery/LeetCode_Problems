package EasyProblems;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SingleNumberSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,1,2,1,2};
		System.out.println("ans : " + singleNumber(nums) );
		
	}
	
	  public static int singleNumber(int[] nums) {
		  Set<Integer> hSet = new HashSet<Integer>();
		  
		  for(int i :nums){

			  if (!hSet.add(i)){

				  hSet.remove(i);
				
			  }
		  }
		  
		  return hSet.iterator().next();
	    }


}

package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getSubsets(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    private void getSubsets(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<Integer>(list));
        // System.out.println("result is: "+result);
        for(int i=start; i<nums.length; i++) {
            // System.out.println("i= "+i);
            list.add(nums[i]);
            // System.out.println("list is : "+list);
            getSubsets(result, list, nums, i+1);
            list.remove(list.size()-1);// why remove? so called backtracking..
            // System.out.println("list after delete: "+list);

        }
    }

}

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, int[]> addsUp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){            
            int[] num = addsUp.get(nums[i]);        
            if( num != null){
                return new int[]{i, num[0]};
            } else{
                addsUp.put(target - nums[i], new int[]{i, nums[i]});                
            }
        }
        return new int[]{};
    }
}
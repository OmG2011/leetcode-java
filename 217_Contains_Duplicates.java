import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> entries = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(entries.get(nums[i]) != null){
                return true;
            }   else{
                entries.put(nums[i], i);
            }
        }
        return false;
    }
}
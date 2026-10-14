import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        Set<Integer> numSet = new HashSet<>();                
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);    
        }   

        for (Integer num : numSet){
            if(!numSet.contains(num - 1)){            
                int nextNum = num + 1;
                int counter = 1;
                while(numSet.contains(nextNum)){
                    counter += 1;
                    nextNum += 1;
                }
                if(counter > maxCount){
                    maxCount = counter;
                }
            }
        }        
        return maxCount;
    }
}
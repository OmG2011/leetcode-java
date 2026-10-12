import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] answer = new int[nums.length];
        int num_of_zeroes = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                num_of_zeroes += 1;
            } else{
                product *= nums[i];
            }

            if(num_of_zeroes > 1){
                break;
            }
        }
        if(num_of_zeroes == 0){
            for(int i=0; i < nums.length; i++){
                answer[i] = product/nums[i];
            }
        } else if(num_of_zeroes == 1){
            for(int i=0; i < nums.length; i++){
                if(nums[i] == 0){
                    answer[i] = product;
                }
            }
        }
        return answer;
    }
}
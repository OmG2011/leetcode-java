import java.util.Arrays;

class Solution {
    public int binarySearch(int[] numbers, int target){
        int low = 0;
        int high = numbers.length - 1;

        while(high >= low){
            int calculation = low + (high - low)/2;
            if(target > numbers[calculation]){
                low = calculation + 1;
            } else if(target < numbers[calculation]){
                high = calculation - 1;
            } else{
                return calculation;
            }
        }
        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int elementFound = binarySearch(Arrays.copyOfRange(numbers, i + 1, numbers.length), target - numbers[i]);
            if(elementFound != -1){
                return new int[] {i + 1, elementFound + 2 + i};
            }
        }
        return new int[] {0,0};
    }
}
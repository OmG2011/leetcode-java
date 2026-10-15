import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public Boolean checkVisited(int i, int j, Set<List<Integer>> visitedSet){
        if (visitedSet.contains(List.of(i, j))){
            return true;
        }
        return false;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        Set<List<Integer>> visitedSet = new HashSet<>();
        int i = 0;
        int j = 0;
        answer.add(matrix[i][j]);
        visitedSet.add(List.of(i, j));
        Boolean addition = true;
        Boolean changeJ = true;
        int counter = 0;

        while(counter < (matrix.length * matrix[0].length) - 1){
            if(changeJ && addition){
                if(j + 1 >= matrix[0].length){
                    changeJ = !changeJ;
                    continue;
                } else{
                    if(!checkVisited(i, j + 1, visitedSet)){
                        j += 1;
                    } else{
                        changeJ = !changeJ;
                        continue;
                    }
                }
            } else if(changeJ && !addition){
                if(j-1 < 0){
                    changeJ = !changeJ;
                    continue;
                } else{
                    if(!checkVisited(i, j - 1, visitedSet)){
                        j -= 1;
                    } else{
                        changeJ = !changeJ;
                        continue;
                    }
                }
            } else if(!changeJ && !addition){
                if(i-1 < 0){
                    changeJ = !changeJ;
                    addition = !addition;
                    continue;
                } else{
                    if(!checkVisited(i - 1, j, visitedSet)){
                        i -= 1;
                    } else{
                        changeJ = !changeJ;
                        addition = !addition;
                        continue;
                    }
                }
            } else if(!changeJ && addition){
                if(i+1 >= matrix.length){
                    changeJ = !changeJ;
                    addition = !addition;
                    continue;
                } else{
                    if(!checkVisited(i + 1, j, visitedSet)){
                        i += 1;
                    } else{
                        changeJ = !changeJ;
                        addition = !addition;
                        continue;
                    }
                }
            }

            counter += 1;
            answer.add(matrix[i][j]);
            visitedSet.add(List.of(i, j));
        }
        return answer;
    }
}
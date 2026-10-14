import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Integer, Character>> gridMap = new HashMap<>();
        Map<Integer, Map<Integer, Character>> nestedMap = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false; 
                    } else {
                        rowSet.add(board[i][j]);
                        
                        Integer gridNum = (3 * (i / 3)) + (j / 3);
                        Map<Integer, Character> innerGridMap = gridMap.computeIfAbsent(gridNum, k -> new HashMap<>());
                        Map<Integer, Character> innerMap = nestedMap.computeIfAbsent(j, k -> new HashMap<>());
                        if (innerMap.containsValue(board[i][j])) {
                            return false;
                        } else {
                            innerMap.put(i, board[i][j]);
                        }

                        if(innerGridMap.containsValue(board[i][j])){
                            return false;
                        } else{
                            int cellId = (i % 3) * 3 + (j % 3);
                            innerGridMap.put(cellId, board[i][j]);                        
                        }
                    }
                }
            }
        }
        return true;
    }
}
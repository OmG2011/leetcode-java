import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1){
            return List.of(Arrays.asList(strs));
        }
        
        Map<Map<Character, Integer>, List<String>> outerMap = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            Map<Character, Integer> innerMap = new HashMap<>();                
            for(int j=0; j < strs[i].length(); j++){            
                Integer value = innerMap.get(strs[i].charAt(j));                
                if(value != null){
                    innerMap.put(strs[i].charAt(j), value + 1);
                }else{
                    innerMap.put(strs[i].charAt(j), 1);
                }
            }                   
            List<String> wordList = outerMap.get(innerMap);
            if(wordList != null){                
                wordList.add(strs[i]);
            } else{
                wordList = new ArrayList<>(); 
                wordList.add(strs[i]);
                outerMap.put(innerMap, wordList);
            }            
        }
        List<List<String>> result = new ArrayList<>(outerMap.values());
        return result;
    }
}
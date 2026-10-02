import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> letters = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            Integer value = letters.get(letter);
            if(value != null){
                letters.put(letter, value + 1);
            }else{
                letters.put(letter, 1);
            }            
        }        
        for(int i = 0; i < s.length(); i++){ 
            Character letter = t.charAt(i)           ;            
            Integer value = letters.get(letter);
            if(value == null){
                return false;
            } else{
                if(value == 1){
                    letters.remove(letter);
                } else if(value > 1){
                    letters.put(letter, value - 1);
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder finalString = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int currentChar = (int) Character.toLowerCase(s.charAt(i));
            if(currentChar >= 97 && currentChar <= 122){
                finalString.append((char)currentChar);
            } else if(currentChar >= 48 && currentChar <= 57){
                finalString.append((char)currentChar);
            }
        }        
        
        for(int i=0; i<finalString.length()/2; i++){            
            if(finalString.charAt(i) != finalString.charAt(finalString.length() - 1 - i)){            
                return false;
            }
        }
        
        return true;
    }
}
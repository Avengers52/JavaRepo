import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character,Character>map = new HashMap<>();
        Map<Character,Character>map2 = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(sArr[i]) && map.get(sArr[i]) != tArr[i]){
                return false;
            }
            else if(map2.containsKey(tArr[i]) && map2.get(tArr[i]) != sArr[i]){
                return false;
            }
            map.put(sArr[i],tArr[i]);
            map2.put(tArr[i],sArr[i]);
        }
        return true;
        
    }
}
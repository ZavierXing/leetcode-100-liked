import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0,left=-1,currentLen=0;
        char ch;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(!map.containsKey(ch)){
                currentLen++;
            }
            else {
                int index=map.get(ch);
                if(index<=left) {
                    currentLen++;
                }
                else {
                    if(currentLen>res){
                        res=currentLen;
                    }
                    left=index;
                    currentLen=i-left;
                }
            }
            map.put(ch, i);
        }
        if(currentLen>res){
            res=currentLen;
        }
        return res;
    }
}
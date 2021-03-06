import java.util.HashSet;
import java.util.Set;


public class Solution {
	public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0 || len == 1) 
            return s.length();
        int slow = 0;
        int fast = 1;
        int count = 1;
        while (fast < len){
            Set< Character> window = new HashSet<>();
            window.add(s.charAt(slow));
            while (fast< len && window.add(s.charAt(fast))){
                fast++;
            }
            if ( (fast-slow) > count)
                count = fast-slow;
            slow++;
            fast= slow+1;
            
        }
        return count;
        
    }
}

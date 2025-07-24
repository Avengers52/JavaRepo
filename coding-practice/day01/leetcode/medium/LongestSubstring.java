public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        java.util.Arrays.fill(index, -1);
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (index[c] >= start) {
                start = index[c] + 1;
            }
            index[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }
}

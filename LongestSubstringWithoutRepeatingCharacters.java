// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class LongestSubStringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder st = new StringBuilder();

        for (char c : s.toCharArray()) {
            int index = st.indexOf(String.valueOf(c));
            if (index != -1) {
                st.delete(0, index + 1);
            }
            st.append(c);
            maxLength = Math.max(maxLength, st.length());
        }

        return maxLength;
    }
}

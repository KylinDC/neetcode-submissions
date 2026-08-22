class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountS = new HashMap<>();
        HashMap<Character, Integer> charCountT = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountS.put(c, charCountS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCountT.put(c, charCountT.getOrDefault(c, 0) + 1);
        }

        return charCountS.equals(charCountT);
    }
}

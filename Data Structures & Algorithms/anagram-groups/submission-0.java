class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            String charCount = calCharCount(str);
            groups.computeIfAbsent(charCount, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }

    private String calCharCount(String str) {
        if (str == null || str.isEmpty())
            return "";

        int[] charCount = new int[26];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            charCount[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                sb.append((char) (i + 'a')).append(charCount[i]);
            }
        }
        return sb.toString();
    }
}

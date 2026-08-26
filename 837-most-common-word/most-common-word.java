

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (String s : banned) {
            set.add(s);
        }

        int i = 0;
        int n = paragraph.length();

        while (i < n) {
            int j = i;
            StringBuilder str = new StringBuilder();

            while (j < n &&
                  ((paragraph.charAt(j) >= 'a' && paragraph.charAt(j) <= 'z') ||
                   (paragraph.charAt(j) >= 'A' && paragraph.charAt(j) <= 'Z'))) {

                str.append(Character.toLowerCase(paragraph.charAt(j)));
                j++;
            }

            if (str.length() > 0) {
                String word = str.toString();

                if (!set.contains(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            i = j + 1;
        }

        String ans = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}
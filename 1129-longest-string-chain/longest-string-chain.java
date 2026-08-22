class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        int n = words.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (getcompare(words[i], words[j]) && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }

            }
            if (maxi < dp[i]) {
                maxi = dp[i];

            }

        }
        return maxi;
    }public static boolean getcompare(String a, String b) {

        
        if (a.length() != b.length() + 1) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < a.length() && j < b.length()) {

            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                
                i++;
            }

        }

        return j == b.length();
    }
}
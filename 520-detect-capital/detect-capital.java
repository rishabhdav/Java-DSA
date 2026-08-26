class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
    
        boolean flag = false;
      if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            if (n>1&&word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                int i = 2;
                while (i < n) {
                    if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                        return false;
                    }
                    i++;
                }

            } else {
                int i = 1;
                while (i < n) {
                    if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                        return false;
                    }
                    i++;
                }

            }

        }

        else {

            int i = 0;
            while (i < n) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
                i++;
            }

        }
        return true;

    }
}
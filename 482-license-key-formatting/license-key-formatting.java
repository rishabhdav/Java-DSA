class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder str = new StringBuilder();
        int i = s.length() - 1;
        int count = 0;

        while (i >= 0) {

            char ch = s.charAt(i);

            if (ch != '-') {

                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 'a' + 'A');
                }

                str.append(ch);
                count++;

                if (count == k) {
                    str.append('-');
                    count = 0;
                }
            }

            i--;
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == '-') {
            str.deleteCharAt(str.length() - 1);
        }

        return str.reverse().toString();
    }
}
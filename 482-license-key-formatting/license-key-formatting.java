class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder str = new StringBuilder();
        int n = s.length();
        int i = n - 1;
        while (i >=0) {
            int j = i;
            int l=k;
            while (j>=0&&l > 0) {
                char ch = s.charAt(j);
                if (s.charAt(j) != '-') {
                    if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                        str.append((char)(s.charAt(j)-'a'+'A'));
                    } else {
                        str.append(s.charAt(j));
                    }
                    l--;
                }
                  j--;
            }
        if(j>=0)    str.append('-');
            i=j;

        }

     if(str.length()>1)   if(str.charAt(str.length()-1)=='-') str.deleteCharAt(str.length()-1);
        return str.reverse().toString();
    }

}
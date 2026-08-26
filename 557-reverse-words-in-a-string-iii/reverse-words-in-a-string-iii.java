class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();
          int n=s.length();
        int i = 0;
        while (i < n) {
            int j = i;
             StringBuilder str1 = new StringBuilder();
            while (j < n && s.charAt(j) != ' ') {
               
                str1.append(s.charAt(j));
                j++;
            }
            str1.reverse();
            str.append(str1);
            if(j<n&&s.charAt(j)==' ') str.append(' ');
            i=j;
            i++; 

        }
        return str.toString();
    }
}
class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;
                if(str.length()>0)str.append(' ');
            int end = i;

            while (i >= 0 && s.charAt(i) != ' ')
                i--;
            for (int j = i+1; j <= end; j++) {
                str.append(s.charAt(j));
            }


        }
return str.toString();
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int cnt=0;
        int i=n1-1;
        StringBuilder str1=new StringBuilder("");
        while(i>=0){

            if(s.charAt(i)=='#'){
                cnt++;
            }

            else{
             if(cnt==0) str1.append(s.charAt(i));
             else {
                cnt--;
             }

            }
            i--;
        }
        cnt=0;
        int j=n2-1;
        StringBuilder str2=new StringBuilder("");
        while(j>=0){

            if(t.charAt(j)=='#'){
                cnt++;
            }

            else{
             if(cnt==0) str2.append(t.charAt(j));
             else {
                cnt--;
             }

            }
            j--;
        }

return str1.toString().equals(str2.toString());
    }
}
class Solution {
    public String toLowerCase(String s) {
        int i=0;
        int n=s.length();
        StringBuilder str=new StringBuilder();
        while(i<n){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                str.append((char)(s.charAt(i)-'A'+'a'));
            }
            else{

                str.append(s.charAt(i));
            }
            i++;

        }
        return  str.toString();
    }
}
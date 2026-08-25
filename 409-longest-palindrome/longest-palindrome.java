class Solution {
    public int longestPalindrome(String s) {
        int len=0;
        int[] ans=new int[128];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)]++;
        }

        int singleNumber=0;
        for(int i=0;i<128;i++){
            if(ans[i]%2==0){
                len=len+ans[i];
            }
     

            if(ans[i]%2==1){
              if(ans[i]==1){
                singleNumber=1;
              }
              else{
                singleNumber=1;
                len=len+(ans[i]-1);
              }
           }
        }
        return len+singleNumber;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr=new int[128];
        int i=0;
        int j=0;
        int n=s.length();
        int maxlen=0;
        while(j<n){
            arr[s.charAt(j)]++;

            if(arr[s.charAt(j)]>1){
                while(arr[s.charAt(j)]>1){
                   arr[s.charAt(i)]--;
                   i++;
                }
            }
             maxlen=Math.max(maxlen,j-i+1);
             j++;

        }
        return maxlen;
    }
}
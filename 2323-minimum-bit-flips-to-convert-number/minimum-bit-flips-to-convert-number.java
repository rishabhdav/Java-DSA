class Solution {
    public int minBitFlips(int start, int goal) {
        int answer=start^goal;

        int cnt=0;
        for(int i=0;i<31;i++){
            if(((answer>>i)&1)==1) cnt++;
        }
        return cnt;
    }
}
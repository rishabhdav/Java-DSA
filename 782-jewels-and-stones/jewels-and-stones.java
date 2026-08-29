class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] ans=new boolean[128];
        for(int i=0;i<jewels.length();i++){
          ans[jewels.charAt(i)]=true;
        }
        int cnt=0;
        for(int j=0;j<stones.length();j++){
            if(ans[stones.charAt(j)]==true) cnt++;
        }
        return cnt;
    }
}
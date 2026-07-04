class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*nums.length];

        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            ans[n+k]=nums[i];
            k++;
        }
        return ans;
    }
}
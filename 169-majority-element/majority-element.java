class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0) { res=nums[i];
            
            cnt++;}
            else if(nums[i]==res) cnt++;
            else cnt--;
        }
cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==res)  cnt++;
        }


        return cnt>nums.length/2?res:-1;
    }
}
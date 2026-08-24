class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        if(nums[n-1]<target) return n;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
 ans=mid;
 e=mid-1;
            }
        }
        return ans;
    }
}
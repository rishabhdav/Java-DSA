class Solution {
    public int findMin(int[] nums) {

int n=nums.length;

     int s=0;
     int e=n-1;
     int min=Integer.MAX_VALUE;
     while(s<=e){
        int mid=s+(e-s)/2;
        if(nums[mid]>=nums[s]){
            min=Math.min(min,nums[s]);
            s=mid+1;
        }
        else{
            min=Math.min(min,nums[mid]);
            e=mid-1;
        }
     }

return min;
    }
}
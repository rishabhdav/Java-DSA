class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            e=Math.max(e,nums[i]);
        }

        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(SolveIt(nums,mid)<=threshold){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
    }
    public static int SolveIt(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(int)Math.ceil((double)nums[i]/mid);
        }
        return sum;
    }
}
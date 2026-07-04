class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1) return new int[]{nums[k],k+1};
        }
       return new int[]{-1,-1};
    }

    public static void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}

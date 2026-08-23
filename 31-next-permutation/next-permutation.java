class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverseIt(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[ind]<nums[i]){
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        Arrays.sort(nums,ind+1,n);
        
    }
    public static void reverseIt(int [] nums,int s,int e){
    while(s<e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
        s++;
        e--;
    }
    }
}
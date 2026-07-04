class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];

        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
        } 
        int suffix=1;
        for(int  k=n-1;k>=0;k--){
            answer[k]=suffix*answer[k];
            suffix=suffix*nums[k];
        }
return answer;
    }
}
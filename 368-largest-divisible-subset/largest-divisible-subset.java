class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        for(int i=0;i<n;i++){
          dp[i]=1;
      
        }
        int maxi=-1;
           int lastindx=-1;
               for(int i=0;i<n;i++){
                  hash[i]=i;
                   for(int j=0;j<i;j++){
                     if(nums[i]%nums[j]==0&&dp[j]+1>dp[i]){
                      dp[i]=dp[j]+1;
                      hash[i]=j;
                      
                    }
                 }
                 if(maxi<dp[i]){
                    maxi=dp[i];
                    lastindx=i;
                 }


        }
List<Integer>list=new ArrayList<>();
list.add(0,nums[lastindx]);
while(lastindx!=hash[lastindx]){
    lastindx=hash[lastindx];
    list.add(0,nums[lastindx]);
}
return list;
         
    }
}
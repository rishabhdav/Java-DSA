class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int l=0;
        int sum=0;
        while(l<nums.length){
            sum=sum+nums[l];
            if(map.containsKey(sum-k)){
                int cnt=map.get(sum-k);              
                count=count+cnt;
                 
            }
           
               if(map.containsKey(sum)){
                int cnt=map.get(sum);              
             
                 cnt++;
                map.put(sum,cnt);
               }
               else{
                map.put(sum,1);
               }
            
            l++;


        }
        return count;
    }
}
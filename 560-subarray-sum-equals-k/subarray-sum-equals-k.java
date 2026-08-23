class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer>map=new HashMap<>();
       int count=0;
       int sum=0;
       map.put(k,0);
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        if(sum==k) count++;
        int rem=sum-k;
        if(map.containsKey(rem)){
            count=count+map.get(rem);
        }
        if(map.containsKey(sum)){
            int cnt=map.get(sum);
            cnt++;
            map.put(sum,cnt);
        }
        else map.put(sum,1);

       } 
       return count;
    }
}
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        boolean[] visited=new boolean[nums.length];
        List<List<Integer>>list=new ArrayList<>();

         Arrays.sort(nums); 
         dfs(nums,visited,list,new ArrayList<>());
         return list;
    }

    public  static void dfs(int[] nums,boolean [] visited, List<List<Integer>>list,List<Integer>curr){

if(curr.size()==nums.length){
    list.add(new ArrayList<>(curr));
    return;
}
for(int i=0;i<nums.length;i++){
    if(visited[i]==true) continue;


if(i>0&&nums[i-1]==nums[i]&&!visited[i-1]) continue;
    visited[i]=true;
    curr.add(nums[i]);    
    dfs(nums,visited,list,curr);
    curr.remove(curr.size()-1);

    visited[i]=false;
}

    }
}
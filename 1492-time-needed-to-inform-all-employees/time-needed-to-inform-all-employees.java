class Pair{
    int x;
    int level;
    Pair(int x,int level){
        this.x=x;
        this.level=level;
    }
}

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
       List<List<Integer>>list=new ArrayList<>();
       boolean[] visited=new boolean[n];
       for(int i=0;i<n;i++){
        list.add(new ArrayList<>());
       }
       for(int i=0;i<n;i++){
    if(manager[i]!=-1)    list.get(manager[i]).add(i);

       }
       Queue<Pair>q=new LinkedList<>();
       q.add(new Pair(headID,0));
       visited[headID]=true;
int cnt=0;
    while(!q.isEmpty()){
        Pair parent=q.poll();
        cnt=Math.max(cnt,parent.level);
         for(Integer it:list.get(parent.x)){
            if(visited[it]==false){
                visited[it]=true;
                q.add(new Pair(it,informTime[parent.x]+parent.level));
            }
         }

    }
return cnt;
    }
}
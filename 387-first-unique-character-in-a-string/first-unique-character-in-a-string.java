class Pair{
    int freq;
    int idx;
    Pair(int freq,int idx){
        this.freq=freq;
        this.idx=idx;
    }
}

class Solution {
    public int firstUniqChar(String s) {
        Pair[] arr=new Pair[26];
        for(int i=0;i<26;i++){
           arr[i]=new Pair(0,i);
        }

        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a'].freq++;
            arr[s.charAt(i)-'a'].idx=i;
            

        }
Arrays.sort(arr,(a,b)->a.idx-b.idx);
        for(int i=0;i<26;i++){
              if(arr[i].freq==1) return arr[i].idx ;           
        }
        return -1;
    }
}
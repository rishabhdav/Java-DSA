class Pair {
    Character x;
    int freq;

    Pair(Character x, int freq) {
        this.x = x;
        this.freq = freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int cnt = map.get(s.charAt(i));
                cnt++;
                map.put(s.charAt(i), cnt);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            Pair p=new Pair(entry.getKey(),entry.getValue());
            pq.add(p);
        }
        StringBuilder str=new StringBuilder();
        while(!pq.isEmpty()){
            Pair np=pq.poll();
            int cnt=np.freq;
            while(cnt>0){
                str.append(np.x);
                cnt--;
            }

        }
return str.toString();
    }
}
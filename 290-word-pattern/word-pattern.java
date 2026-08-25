class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        int n = pattern.length();
        int m=s.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            char char1 = pattern.charAt(i);

            while (j < m && s.charAt(j) == ' ')
                j++;

                 if (j >= m) {
                return false;
            }

            StringBuilder str = new StringBuilder();

            while (j < m && s.charAt(j) != ' ') {
                str.append(s.charAt(j));
             
                j++;
            }
               System.out.println(str.toString());
            if (map.containsKey(char1)) {
                if (!map.get(char1).equals(str.toString())) {
                    return false;
                }
               
                
            } 
            if(map1.containsKey(str.toString())){
                 if(!map1.get(str.toString()).equals(char1)) return false;
            }

            
            else{
                map.put(char1, str.toString());
                map1.put(str.toString(),char1);

            }

        }

       while (j < m && s.charAt(j) == ' ') {
            j++;
        }

        if (j < m) {
            return false;
        }
        return true;
    }
}
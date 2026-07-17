class Solution {
    public List<Integer> findAnagrams(String s, String p) {
   
int[] arr1=new int[26];
int [] arr2=new int[26];

List<Integer>list=new ArrayList<>();
   if(s.length()<p.length())   return list;
for(int i=0;i<p.length();i++){
    arr1[p.charAt(i)-'a']++;
    arr2[s.charAt(i)-'a']++;
}
if(Arrays.equals(arr1,arr2))list.add(0);
int k=0;
for(int j=p.length();j<s.length();j++){
    arr2[s.charAt(k)-'a']--;
    k++;
    arr2[s.charAt(j)-'a']++;
    if(Arrays.equals(arr1,arr2))list.add(k);
}
return list;

}

    }

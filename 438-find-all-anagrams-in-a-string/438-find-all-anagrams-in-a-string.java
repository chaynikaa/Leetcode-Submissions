class Solution {
  public List<Integer> findAnagrams(String s, String p) {
      
      List<Integer> ans = new ArrayList<>();
      int ns = s.length();
      int np = p.length();
      
        if (ns < np)     //not possible
        return ans;

    Map<Character, Integer> pCount = new HashMap();
    Map<Character, Integer> sCount = new HashMap();
      
    // build reference hashmap using string p
    for (char ch : p.toCharArray()) {  //putting the values of p in the hashmap(to find its anagram)
      if (pCount.containsKey(ch)) {
        pCount.put(ch, pCount.get(ch) + 1);
      }
      else {
        pCount.put(ch, 1);
      }
    }

    // sliding window on the string s
    for (int i = 0; i < ns; ++i) {
      // add one more letter 
      // on the right side of the window
      char ch = s.charAt(i);
      if (sCount.containsKey(ch)) {
        sCount.put(ch, sCount.get(ch) + 1);
      }
      else {
        sCount.put(ch, 1);
      }
      // remove one letter 
      // from the left side of the window
      if (i >= np) {
        ch = s.charAt(i - np);
        if (sCount.get(ch) == 1) {
          sCount.remove(ch);
        }
        else {
          sCount.put(ch, sCount.get(ch) - 1);
        }
      }
      // compare hashmap in the sliding window
      // with the reference hashmap
      if (pCount.equals(sCount)) {
        ans.add(i - np + 1);
      }
    }
    return ans;
  }
}
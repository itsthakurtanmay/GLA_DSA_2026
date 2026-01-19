class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(! hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                int val = hm.get(s.charAt(i));
                val++;
                hm.put(s.charAt(i),val);
            }
        }
        int freq = hm.get(s.charAt(0));
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if(freq != entry.getValue()){
                return false;
            }
            // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return true;

        
    }
}
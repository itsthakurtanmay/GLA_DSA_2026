class Solution {
    public boolean areOccurrencesEqual(String s) {
        //Step 1 : Hashmap create krdo;
        HashMap<Character, Integer>hm = new HashMap<>();

        //step 2 : Iterate on each character of string;
        for(int i = 0;i<s.length();i++){
            //case 1 : Already character exist hoga 
            //case 2 : First time aayega character;
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


        for (Map.Entry<Character, Integer> set : hm.entrySet()) {

            if(freq != set.getValue())return false;
        }

        return true;

        


        
    }
}
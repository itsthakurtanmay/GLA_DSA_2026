import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer>hm = new HashMap<>();

        //step 2 : Iterate on each character of string;
        for(int i = 0;i<arr.length;i++){
            //case 1 : Already character exist hoga 
            //case 2 : First time aayega character;

            if(! hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                int val = hm.get(arr[i]);
                val++;
                hm.put(arr[i],val);
            }
        }

        System.out.print(hm);

        HashSet<Integer>hs = new HashSet<>();
        for (Map.Entry<Integer, Integer> set : hm.entrySet()) {

            hs.add(set.getValue());
        }

        return hs.size() == hm.size();
        
    }
} {
    
}

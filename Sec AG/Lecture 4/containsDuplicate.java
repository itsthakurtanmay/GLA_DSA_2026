
import java.util.HashSet;


class Solution {

    public boolean containsDuplicate(int[] nums) {

        //Brute Force
        // ArrayList<Integer>al = new ArrayList<>();
        // for(int i = 0;i<nums.length;i++){
        //     if(! al.contains(nums[i]))al.add(nums[i]);----> Takes O(N) -> so , overall complexity is O(N);
        //     else return true;
        // }
        // return false;
        //Note : This Solution will give you TLE(Time Limit Exceed);
        //optimized Solution
        HashSet<Integer> al = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i])) {
                al.add(nums[i]); 
            }else {
                return true;
            }
        }
        return false;

    }
}

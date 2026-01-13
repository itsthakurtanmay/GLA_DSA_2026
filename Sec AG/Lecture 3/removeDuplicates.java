class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if( ! al.contains(nums[i])){
                al.add(nums[i]);
            }
        }
        int idx = 0;
        for(int i = 0;i<al.size();i++){
            nums[idx] = al.get(i);
            idx++;
        }

        return al.size();
        
    }
}
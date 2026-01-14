class sortArrayByParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer>even = new ArrayList<>();
        ArrayList<Integer>odd = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0)even.add(nums[i]);
            else odd.add(nums[i]);
        }

        boolean flag = true;
        int idx = 0;
        int i = 0;//it points to even arraylist 0th index;
        int j = 0;//it points to odd arraylist 0th index;

        while(i < even.size() && j < odd.size()){
            if(flag == true){
                nums[idx] = even.get(i);
                i++;
                flag = false;
            }
            else{
                nums[idx] = odd.get(j);
                j++;
                flag = true;
            }
            idx++;

        }

        while(i < even.size()){
            nums[idx] = even.get(i);
            i++;
            idx++;

        }

        while(j < odd.size()){
            nums[idx] = odd.get(j);
            j++;
            idx++;

        }

        return nums;

      
        
    }
}
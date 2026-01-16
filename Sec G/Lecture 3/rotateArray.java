class rotateArray{

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int temp[] = new int[n];
        int idx = 0;
        //last k element ko copy kar diya;
        for(int i = n-k;i<n;i++){
            temp[idx]= nums[i];
            idx++;
        }
        //first element copy karo but before kth element;
        for(int i = 0;i<n-k;i++){
            temp[idx++] = nums[i];
        }
        for(int i = 0;i<temp.length;i++){
            nums[i] = temp[i];
        }
        
    }

}

class Solution {

    public double findMaxAverage(int[] arr, int k) {
        int s  = 0;       
        double currExpense = 0;
        double maxExpense = Double.NEGATIVE_INFINITY;
        int e = 0;
        while(e < arr.length){
            currExpense+=arr[e];
            if(e-s+1 < k){ 
                e++;  
            }      
            else if(e-s+1 == k){
                maxExpense = Math.max(currExpense, maxExpense);
                currExpense-=arr[s];
                s++;
                e++;  
            }


        return maxExpense/k;
            
}
    }
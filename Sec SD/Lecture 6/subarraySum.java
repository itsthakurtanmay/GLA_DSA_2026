public class subarraySum {
    public static void main(String[]args){
        int []arr = {100,400,300,500,200,500,600,700};
        int k = 4;
        int maxExpense = Integer.MIN_VALUE;//-infinity
        for(int i = 0;i<arr.length-3;i++){//i = 0 , 0<8
            int currExpense = 0;//0
            for(int j = i;j<i+k;j++){//j = 0;0<4;
                System.out.print(arr[j]+" ");
                currExpense+=arr[j];
            }
            System.out.println(currExpense+" ");
            maxExpense = Math.max(currExpense,maxExpense);
        }
        System.out.println(maxExpense);

    }
    
}

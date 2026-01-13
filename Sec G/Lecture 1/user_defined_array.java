
import java.util.Scanner;

public class user_defined_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] nums = new int[n];

        //user input;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of" + i + "th index");
            int x = sc.nextInt();
            nums[i] = x;
        }

        

        // for (int i = 0; i < n; i++) {
        //     System.out.print(nums[i] + " ");
        // }
    }
}

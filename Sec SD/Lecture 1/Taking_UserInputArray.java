
import java.util.Scanner;

public class Taking_UserInputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //user input;
       for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for " + i + "th index");
            int x = sc.nextInt();
            arr[i] = x;
        }

        //printing;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

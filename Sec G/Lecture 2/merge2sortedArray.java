
import java.util.Scanner;

public class merge2sortedArray {

    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        //new array create krta : n +m;
        int[] temp = new int[n + m];

        //pointer set kardo;
        int i = 0;
        int j = 0;
        int idx = 0;

        //set condition while loop;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                temp[idx] = nums1[i];
                i++;
                idx++;
            } else {
                temp[idx] = nums2[j];
                j++;
                idx++;
            }
        }

        while (i < n) {
            temp[idx] = nums1[i];
            i++;
            idx++;
        }

        while (j < m) {
            temp[idx] = nums2[j];
            j++;
            idx++;
        }

        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first Array");
        int n = sc.nextInt();
        System.out.println("Enter the size of second Array");
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + i + "th index");
            int x = sc.nextInt();
            nums1[i] = x;
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the value of " + i + "th index");
            int x = sc.nextInt();
            nums2[i] = x;
        }

        merge(nums1, n, nums2, m);

    }
}

// Preogram to Merge Sorted Arrays
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray0088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter number of elements in nums1 (m + n): ");
        int size1 = sc.nextInt();

        int[] nums1 = new int[size1];

        System.out.print("Enter number of valid elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        MergeSortedArray0088 obj = new MergeSortedArray0088();
        obj.merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(nums1));

        sc.close();
    }
}

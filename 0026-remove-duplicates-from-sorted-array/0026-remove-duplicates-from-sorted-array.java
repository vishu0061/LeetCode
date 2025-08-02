import java.util.Scanner;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int left = 0;

        for (int right = 1; right < n; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }

        for (int i = left + 1; i < n; i++) {
            nums[i] = -1;
        }

        return left + 1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            if (num == -1) {
                System.out.print("_ ");
            } else {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        int newLength = removeDuplicates(arr);

        System.out.println("After removing duplicates:");
        printArray(arr);
    }
}

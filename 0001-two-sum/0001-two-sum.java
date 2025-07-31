import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of nums:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        if(result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}


import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    int[] answer = { i, j };
                    return answer;
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        System.out.println("Enter size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();

    }
}
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = the number value, Value = its index in the array
        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int requiredValue = target - currentNum;

            // If the complement exists in our map, we found the pair
            if (visitedNumbers.containsKey(requiredValue)) {
                return new int[] { visitedNumbers.get(requiredValue), i };
            }

            // Otherwise, "remember" this number and its index for future checks
            visitedNumbers.put(currentNum, i);
        }

        // Return empty array or throw error if no solution is found (per LeetCode constraints)
        return new int[] {};
    }
}
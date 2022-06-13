
//Code it now: https://oj.leetcode.com/problems/two-sum/ 				Difficulty: Easy, Frequency: High

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) 
                return new int[] { map.get(target - x), i };
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

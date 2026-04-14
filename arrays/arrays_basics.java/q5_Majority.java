//169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int key = nums.length/2;
        return nums[key];
    }
}
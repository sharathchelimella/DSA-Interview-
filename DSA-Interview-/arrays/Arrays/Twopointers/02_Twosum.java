//167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length-1;
        int i = 0;

        while(i<n){
            int sum = nums[i]+nums[n];
            if(sum == target){
                return new int[] {i+1,n+1};
            }else if(sum>target){
                n--;
            }else{
                i++;
            }
        }
        return new int[] {};
        
    }
}
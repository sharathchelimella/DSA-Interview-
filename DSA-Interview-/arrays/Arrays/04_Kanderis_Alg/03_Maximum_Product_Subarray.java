//152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0];
        int max = nums[0];
        int min_product = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }
           max_product = Math.max(max_product*nums[i],nums[i]);
           min_product = Math.min(min_product*nums[i],nums[i]);
           max = Math.max(max_product,max);
            
        }
        return max;
    }
}
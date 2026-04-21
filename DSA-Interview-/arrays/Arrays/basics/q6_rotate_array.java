package basics;
// 189. Rotate Array
class Solution {

    public static void magic(int[] nums,int left, int right){
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k= k%n;
        
        magic(nums,0,n-1);
        magic(nums,0,k-1);
        magic(nums,k,n-1); 
    }
}
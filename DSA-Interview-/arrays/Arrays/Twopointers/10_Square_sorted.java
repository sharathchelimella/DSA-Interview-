//977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left  = 0;
        int right = n-1;
        int[] pos = new int[n];
        int res = n-1;

        while(left <= right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq>rightsq){
                pos[res] = leftsq;
                left++;
            }else{
                pos[res] = rightsq;
                right--;
            }
            res--;
        }   
        return pos; 
    }
}
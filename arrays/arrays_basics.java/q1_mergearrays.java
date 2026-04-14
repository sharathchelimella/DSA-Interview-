//Q1.88. Merge Sorted Array
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--]; 
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        
    }
    public static void main(String[] args){
        int nums1 = {8,5,3};
        int nums2 = {4,1,9};

        int m = nums1.length;
        int n = nums2.length;

        merge(nums1,m-1,nums2,n-1);
    }
}



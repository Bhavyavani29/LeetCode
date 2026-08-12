class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sorted[] = new int[m+n];
        int k = 0, i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                sorted[k] = nums1[i];
                i++;
            }
            else{
                sorted[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            sorted[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            sorted[k] = nums2[j];
            j++;
            k++;
        }
        int mid = sorted.length/2;
        if (sorted.length % 2 == 0) {
            return(sorted[mid - 1] + sorted[mid]) / 2.0;
        }
        return sorted[mid];
    }
}
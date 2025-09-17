// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int midIndex1 = (totalLength - 1) / 2;
        int midIndex2 = totalLength / 2;

        int i = 0, j = 0, count = 0;
        int median1 = 0, median2 = 0;

        while (count <= midIndex2) {
            int val;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            if (count == midIndex1) {
                median1 = val;
            }
            if (count == midIndex2) {
                median2 = val;
            }
            count++;
        }

        return (median1 + median2) / 2.0;
    }
}

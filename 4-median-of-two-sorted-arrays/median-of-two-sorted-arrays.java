class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       final int[] joinArray = merge(nums1, nums2);
        final int middle = joinArray.length / 2;
        if(joinArray.length % 2 == 1) {
            return joinArray[middle];
        } else {
            return (joinArray[middle] + joinArray[middle - 1]) / 2.0;
        }

    }

    public int[] merge(final int[] nums1, final int[] nums2) {
        final int[] joinArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                joinArray[k] = nums1[i];
                i++;
            } else {
                joinArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length) {
            joinArray[k] = nums1[i];
            k++;
            i++;
        }
        while(j < nums2.length) {
            joinArray[k] = nums2[j];
            k++;
            j++;
        }


        return joinArray;
    }
}
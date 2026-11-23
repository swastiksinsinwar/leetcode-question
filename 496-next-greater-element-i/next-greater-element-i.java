class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n1 = nums2.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int target = nums1[i];
            int Greater = -1;

            for (int j = 0; j < n1; j++) {
                if (nums2[j] == target) {
                    for (int m = j + 1; m < n1; m++) {
                        if (nums2[m] > target) {
                            Greater = nums2[m];
                            break;
                        }
                    }
                    break;
                }
            }

            arr[i] = Greater;
        }

        return arr;
    }
}
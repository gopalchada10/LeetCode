class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a, b;

        int x, c = 0, temp = 0;
        x = m + n;
        a = new int[x];
        b = new int[n];

        for (int i = 0; i < m; i++) {
            a[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = nums2[i];
        }

        for (int i = m; i < x; i++) {

            a[i] = b[c];
            c++;
        }
        for (int i = 0; i < x; i++) // [1,2,3,2,5,6]
        {
            for (int j = i + 1; j < x; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < x; i++) {
            nums1[i] = a[i];
        }

    }
}

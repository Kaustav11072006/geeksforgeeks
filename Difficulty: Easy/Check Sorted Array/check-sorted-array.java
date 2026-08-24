class Solution {
    public boolean isSorted(int[] arr) {
        if (arr.length <= 1) return true;

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isAscending = false;
            }
            if (arr[i - 1] < arr[i]) {
                isDescending = false;
            }
        }

        return isAscending || isDescending;
    }
}
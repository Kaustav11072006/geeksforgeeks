class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers toward the center
            start++;
            end--;
        }
    }
}
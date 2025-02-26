class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]){
                start = mid;
            }
            if(arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return 0;
    }
}
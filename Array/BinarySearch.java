package Array;

public class BinarySearch {

    static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;  
        } else if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res = binarySearch(arr, 6, 0, arr.length - 1);
        System.out.println(res);
    }
}

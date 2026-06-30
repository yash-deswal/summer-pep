package Recursion;

public class BinarySearch {
    static boolean binarySearch(int[] arr, int left, int right, int target) {
        if (left >= right) return false;
        int mid = (left + right) / 2;
        if (mid == target) return true;
        if (mid < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 6));
    }
}

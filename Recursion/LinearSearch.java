package Recursion;

public class LinearSearch {
    static boolean linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) return false;
        if (arr[i] == target) return true;
        return linearSearch(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (linearSearch(arr, 6, 0)) {
            System.out.println("Element exists");
        } else {
            System.out.println("Element does not exist");
        }
    }
}

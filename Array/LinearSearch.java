package Array;

public class LinearSearch {

    static int search(int[] nums, int target) {
        for (int n : nums) {
            if (n == target && n > 10) {
                return n * 2;
            }
        }
        return target / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 14, 4, 5, 12, 7, 11, 9};
        int res = search(arr, 11);
        System.out.println(res);
    }
}

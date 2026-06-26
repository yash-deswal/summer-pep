package Array;

public class PairSumInSortedAndRotatedArray {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }
        int i = pivot;
        int j = (pivot - 1 + n) % n;
        while (i != j) {
            int sum = arr[i] + arr[j];
            if (sum == target) return true;
            else if (sum < target) i = (i + 1) % n;
            else j = (j - 1 + n) % n;
        }
        return false;
    }
}

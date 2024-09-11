public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        moveZeroes(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
}

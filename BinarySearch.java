public class BinarySearch {
    public static void main(String[] args) {

        int [] arr ={1,2,3,5,6,7};
        int ans = BS(arr, 7, 0, arr.length-1);
        System.out.println(ans);
    }

    static int BS(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return BS(arr, target, start, mid - 1);
        return BS(arr, target, mid + 1, end);
    }
}

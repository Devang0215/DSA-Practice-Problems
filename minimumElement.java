// here we have used Recursion to find the minimun eleent in the array 
public class minimumElement {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 5, 1 };
        System.out.println(minimum(arr, arr.length));
    }

    // function that will return the minimum after comparing th etwo values
    static int min(int a, int b) {
        return a > b ? b : a;
    }

    static int minimum(int[] arr, int n) // here n is the array length
    {
        if (n == 1)
            return arr[0];
        else
            return min(arr[n - 1], minimum(arr, n - 1));
    }
}


public class Ex13 {
    /**
     * Calculates the shortest time for a driver to travel on two roads,
     * considering the possibility of switching roads only once.
     * The time complexity is O(n) because we iterate over the segments of the roads once.
     * The space complexity is O(n) because we use two additional arrays of size n to store the accumulated times.
     *
     * @param road1 Array representing the time required to pass each segment on road 1.
     * @param road2 Array representing the time required to pass each segment on road 2.
     * @return The shortest time in minutes for the driver to travel. 
     */
    public static int shortestRoad(int[] road1, int[] road2) {
        int n = road1.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        dp1[0] = road1[0];
        dp2[0] = road2[0];

        for (int i = 1; i < n; i++) {
            dp1[i] = dp1[i-1] + road1[i];
        }

        for (int i = 1; i < n; i++) {
            dp2[i] = dp2[i-1] + road2[i];
        }

        int minTime = Math.min(dp1[n-1], dp2[n-1]);

        for (int i = 1; i < n; i++) {
            int time = Math.min(dp1[i-1], dp2[i-1]) + Math.min(dp1[n-1] - dp1[i-1], dp2[n-1] - dp2[i-1]);
            minTime = Math.min(minTime, time);
        }

        return minTime;
    }

    /**
     * Find the missing number in the  arithmetic sequence.
     * Time Complexity is  O(log n) because the method uses a binary search algorithm to find the missing value in the arithmetic sequence.   
     * Space Complexity is O(1) because they only use a constant amount of additional memory. 
     * They do not create any new data structures that grow with the size of the input array.
     *
     * @param arr Array the arithmetic sequence array with one missing number.
     * @return The missing number.
     *
     * 
     */
    public static int missingValue (int [] arr){
        int mainD = (arr[arr.length -1]- arr[0])/arr.length;
        return binarySearch(arr, mainD);

    }

    private static int binarySearch(int [] arr, int mainD){
        int low = 0, high = arr.length;
        int mid, lowD, highD;

        while (high - low != 1){
            mid = (low + high)/2;
            lowD = (arr[mid] - arr[low])/ (mid - low);
            highD = (arr[high-1] - arr[mid])/ (high - mid - 1);

            if (lowD != mainD){
                high = mid;
            }

            if (highD != mainD){
                low = mid;
            }

        };
        return arr[high] - mainD;   
    }
}

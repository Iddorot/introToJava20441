/**
 * Calculates the shortest time for a driver to travel on two roads,
 * considering the possibility of switching roads only once.
 *
 * @param road1 Array representing the time required to pass each segment on road 1.
 * @param road2 Array representing the time required to pass each segment on road 2.
 * @return The shortest time in minutes for the driver to travel.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Explanation:
 * The method uses dynamic programming to calculate the shortest time for reaching
 * each segment starting from each road. It initializes two arrays, dp1 and dp2, to store
 * the accumulated time for each segment on each road.
 * 
 * The first loop calculates the shortest time for reaching each segment starting on road1,
 * and the second loop calculates the shortest time for reaching each segment starting on road2.
 * 
 * After that, the method iterates over the segments and considers the possibility of switching roads.
 * It calculates the total time by summing the time spent on each road before and after the switch.
 * Finally, it keeps track of the minimum time found.
 * 
 * The time complexity is O(n) because we iterate over the segments of the roads once.
 * The space complexity is O(n) because we use two additional arrays of size n to store the accumulated times.
 * 
 */
public class Ex13 {
    public static int shortestRoad(int[] road1, int[] road2) {
        int n = road1.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        dp1[0] = road1[0];
        dp2[0] = road2[0];

        // Calculate the shortest time for reaching each segment starting on road1
        for (int i = 1; i < n; i++) {
            dp1[i] = dp1[i-1] + road1[i];
        }

        // Calculate the shortest time for reaching each segment starting on road2
        for (int i = 1; i < n; i++) {
            dp2[i] = dp2[i-1] + road2[i];
        }

        int minTime = Math.min(dp1[n-1], dp2[n-1]); // Initialize with the time without switching

        for (int i = 1; i < n; i++) {
            int time = Math.min(dp1[i-1], dp2[i-1]) + Math.min(dp1[n-1] - dp1[i-1], dp2[n-1] - dp2[i-1]);
            minTime = Math.min(minTime, time);
        }

        return minTime;
    }
}

public class Ex13 {
    public static int shortestRoad(int[] road1, int[] road2) {
        return shortestRoad(road1, road2, road1.length + 1, road2.length + 1);
    }

    private static int shortestRoad(int[] road1, int[] road2, int road1Length, int road2Length) {
        int[][] dp = new int[road1Length][road2Length];

        // logic for calculating the smallest sum

        return dp[road1Length - 1][road2Length - 1];
    }
}

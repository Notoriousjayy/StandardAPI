package Utility;

public class PrintStatistics {
    private static double mean = 0;
    private static double standardDeviation = 0;

    /**
     * input:
     * output:
     * description:
     */
    public static void statistics(int N) {
        NumberSequence numberSequence = new NumberSequence();
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 0; i < N; i++) {
            double distance = numberSequence.next();
            int j = i + 1;
            System.out.println("Point " + j + ": " + distance);

            // Calculates the Average
            mean += distance / N;

            // Calculates the Standard Deviation
            standardDeviation += (distance * distance) / N;
        }
        standardDeviation = Math.sqrt(standardDeviation - mean * mean);
        System.out.println();
        System.out.println("average distance of " + N + " points from the origin (0,0)");
        System.out.println("\t Average: " + mean);
        System.out.println();
        System.out.println("standard deviation " + N + " points from the origin (0,0)");
        System.out.println("\t Standard Deviation: " + standardDeviation);
    }
}

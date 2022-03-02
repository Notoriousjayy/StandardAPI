package Utility;

public class PrintStatistics {
    private static int N;
    private static double m = 0;
    private static double s = 0;

    public PrintStatistics(int n) {
        N = n;
    }

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
            double d = numberSequence.next();
            int j = i+1;
            System.out.println("Point " + j +": " + d);

            // Calculates the Average
            m += d / N;

            // Calculates the Standard Deviation
            s += (d * d) / N;
        }
        s = Math.sqrt(s - m * m);
        System.out.println();
        System.out.println("average distance of " + N + " points from the origin (0,0)");
        System.out.println("\t Average: " + m);
        System.out.println();
        System.out.println("standard deviation " + N + " points from the origin (0,0)");
        System.out.println("\t Standard Deviation: " + s);
    }
}

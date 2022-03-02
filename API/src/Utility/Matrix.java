package Utility;

import com.company.Points2D;

public class Matrix {

    /**
     * input:
     * output:
     * description:
     */
    public static double[][] initializeMatrix(int N){
        /**
         * Input: Size of array n
         * Output: an array of size n initilized to 0
         */
        double[][] c = new double[N][N];

        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                c[i][j] = 0.0;
            }
        }
        return c;
    }

    /**
     * input:
     * output:
     * description:
     */
    public static double[][] multiply(double[][] a, double[][] b){
        /**
         * Input: This function takes in to matricies.
         * Output: returns the product of the two matrices.
         * Description:
         */
        int N = a.length;
        double[][] c = new double[N][N];

        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(int i = 0; i < N; i++){

            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for(int j = 0; j < N; j++){
                for(int k = 0; k < N; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    /**
     * input: A matrix of any size
     * output: The Transpose of the matrix
     * description: Finds the Transpose of the matrix
     */
    public static void Transpose(double arr[][]) {
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 0; i < arr[0].length; i++) {
            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j][i] + "\t");
            }
        }
    }

    /**
     * input:
     * output:
     * description:
     */
    public static void printMatrix(double arr[][]){
        /**
         * Input: A 2-dimensional matrix
         * Output: print the matrix to standard output
         */
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 0; i < arr[0].length; i++) {
            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * input:
     * output:
     * description:
     */
    public static void printPointsList(Points2D arr[]){
        /**
         * Input: Takes in a 1-Dimmensional array of points
         * Output: prints the points to standard output
         */
        for(Points2D point: arr){
            System.out.println(point);
        }
    }

    /**
     * input:
     * output:
     * description:
     */
    public static double[][] convertToMatrix(Points2D[] points, int N){
        /**
         * Input: Takes in a list of poiints and the size of the list
         * Output: Converts the points list to a matrix and returns the matrix
         */

        // Declares the matrix
        double matrix[][];

        /**
         * Always test if a user enters a number that is too large to fit inside of an integer.
         * If the number is too large throw an OutOfMemoryError exception.
         */
        try{
         matrix = new double[2][N];
            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (int i = 0; i < N; i++) {

                // Initialzies the X column
                matrix[0][i] = points[i].getX();

                // Initialzies the Y column
                matrix[1][i] = points[i].getY();
            }
            return matrix;
        } catch (OutOfMemoryError e){
            System.out.println("Out of memeory");
        };
        return null;
    }
}

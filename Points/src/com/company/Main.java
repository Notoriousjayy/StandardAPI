package com.company;

import Models.CircularListMemoryAllocation;
import Utility.Matrix;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        NumberSequence numberSequence = new NumberSequence();

        Scanner number = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the number of random points you want to generate.\t");

        int N = number.nextInt();
        Points2D[] points = new Points2D[N];

        // Generates random points into a list.
        for (int i = 0; i < N; i++) {
            points[i] = numberSequence.nextPoint();
        }

        // Converts a list of 2D points into a matrix.
        double matrix[][] = Matrix.convertToMatrix(points, N);

        // Finds the closest points in the list of points.
        ClosePoints newPoints = new ClosePoints(N, points);

        // Converts matrix from row major ordering to column major ordering
        Matrix.Transpose(matrix);
        System.out.println();

        // Utility function
        Matrix.printMatrix(matrix);
        System.out.println();
        System.out.println(newPoints);
        System.out.println();

        //
        Matrix.printPointsList(newPoints.points);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Prints Statics");
        PrintStatistics.statistics(N);
        System.out.println();
        SieveOfEratosthenes.Sieve(N);

        System.out.print("Number the number of people you want to skip.\t");

        int M = number.nextInt();
//      Fix this
//        ListSort.print(ListSort.sort(ListSort.create()));
        Josephus.JosephusFunction(N,M);

        /**
         * This is a client implementation of CircularList class to solve the Josephus problem.
         *
         * Work to understand this better. Draw a diagram for a few instances of N.
         * Really work to understand this.
         */
        CircularListMemoryAllocation List = new CircularListMemoryAllocation();
        CircularListMemoryAllocation.Node x = null;
        for(int i = 1; i <= N; i++){
            x = List.insert(x, i);
        }
        while(x != List.next(x)){
            for(int i =1; i < M; i++){
                x = List.next(x);
            }
            List.remove(x);
        }
        System.out.println("Survivor is " + List.value(x));

        System.out.println(Strings.squeeze("J      o      r      d     a      n"));

        /**
         * Fix this for program 3.16 on page 120
         */
//        AdjacencyMatrix.AdjacencyMatrix();

        /**
         * Fix this for program 3.17 on page 123
         */
//        int V = Integer.parseInt(args[0]);
//        Fix this for AdjacencyList
//        int E = Integer.parseInt(args[1]);
//        Node adj[] = new Node[V];
//        for (int i = 0; i < V; i++) {
//            adj[i] = null;
//        }
//        for (In.init(); !In.empty() ;){
//            int i = In.getInt();
//            int j = In.getInt();
//
//            adj[j] = new Node(i, adj[j]);
//            adj[i] = new Node(j, adj[i]);
//        }

        /**
         * Fix this for Program 3.18 124
         */
//        int i, N = Integer.parseInt(args[0]);
//        d = Double.parseDouble(args[1]);
//        G = (int) (1.0/d);
//        g = new Node[G+2][G+2];
//        for (i = 0; i < G+2; i++)
//            for (int j = 0; j < G+2; j++)
//                g[i][j] = null;
//        for (i = 0; i < N; i++)
//            gridInsert(new TwoDPoints());
//        System.out.print((cnt + " pairs "));
//        System.out.println("closer than " + d);
    }
}
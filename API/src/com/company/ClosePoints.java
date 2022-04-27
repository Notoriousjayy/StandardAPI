package com.company;

import java.util.Arrays;

public class ClosePoints {

    int N;
    double distance;
    Real2DPoint[] points;
    int firstPoint = 0;
    int secondPoint = 0;

    public ClosePoints(int N, Real2DPoint[] points) {
        /**
         * Finds the distance between two closest points in the plane by brute force
         * Input: A list of Points of N (N >= 2) points
         * Output: The Euclidean distance between the closest pair of points d
         */
        this.N = N;
        this.points = points;
        this.distance = Double.POSITIVE_INFINITY;
        double lowest;

        System.out.println();
        System.out.println("Point A" + "\t\t" + "Point B " + "\t" + "Distance");
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 0; i < N; i++) {
            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (int j = i + 1; j < N; j++) {
                distance = Math.min(distance, points[i].distance(points[j]));

                //
                if (distance == points[i].distance(points[j])) {
                    firstPoint = i;
                    secondPoint = j;
                }

                // Figure out how to move this information from this class.
                System.out.println("point: " + i + "\t" + "point: " + j + "\t" + "distance: " + points[i].distance(points[j]));
            }
        }
    }

    @Override
    public String toString() {
        return "ClosePoints{" + "\n" +
                "\tnumberOfPoints = " + N + ",\n" +
                "\tminimumDistance = " + distance + ",\n" +
                "\tpointsList = " + Arrays.toString(points) + ",\n" +
                "\tclosestPair = " + "point: " + firstPoint + " and " + " point: " + secondPoint + ",\n" +
                '}';
    }
}

//class ClosePoints {
//    static class Node {
//        TwoDPoints p;
//        Node next;
//
//        Node(TwoDPoints x, Node t) {
//            p = x;
//            next = t;
//        }
//    }
//
//    static int G, cnt = 0;
//    static double d;
//    static Node[][] g;
//
//    static void gridInsert(TwoDPoints p) {
//        int X = (int) (p.x * G) + 1;
//        int Y = (int) (p.y * G) + 1;
//        Node s;
//        Node t = new Node(p, g[X][Y]);
//
//        for (int i = X - 1; i <= X + 1; i++) {
//            for (int j = Y - 1; j <= Y + 1; j++) {
//                for (s = g[i][j]; s != null; s = s.next) {
//                    if (s.p.distance(t.p) < d) cnt++;
//                }
//            }
//        }
//        g[X][Y] = t;
//    }
//}
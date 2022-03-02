package com.company;

import Utility.In;

public class AdjacencyMatrix {

    static int Node;
    static int Edge;
    static boolean adjacent[][] = new boolean[Node][Node];

    public static void AdjacencyMatrix() {
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(int i = 0; i < Node; i++){
            for(int j = 0; j < Node; j++){
                adjacent[i][i] = false;
            }
        }
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(int i = 0; i < Node; i++){
            adjacent[i][i] = true;
        }
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(In.init(); !In.empty();){
            int i = In.getInt();
            int j = In.getInt();
            adjacent[i][j] = true;
            adjacent[j][i] = true;
        }
    }

}

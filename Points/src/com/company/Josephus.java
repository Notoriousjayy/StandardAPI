package com.company;

import Models.GenericNode;

public class Josephus {

    /**
     * input:
     * output:
     * description:
     */
    public static void JosephusFunction(int N, int M){
        GenericNode temp = new GenericNode(1);
        GenericNode x = temp;
        for(int i = 2; i <= N; i++){
            x = (x.next = new GenericNode(i));
        }
        x.next = temp;
        while (x != x.next){
            for(int i = 1; i < M; i++){
                x = x.next;
            }

            x.next = x.next.next; // Removes the node following node x from the list
        }
        System.out.println("Survivor is " + x.item);
    }
}

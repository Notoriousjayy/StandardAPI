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
            x.setNext(new GenericNode(i));
            x = x.getNext();
            System.out.println(x.getItem());
        }

        x.setNext(temp);

        while (x != x.getNext()){
            for(int i = 1; i < M; i++){
                x = x.getNext();
            }

            x.setNext(x.getNext().getNext()); // Removes the node following node x from the list
        }
        System.out.println("Survivor is " + x.getItem());
    }
}

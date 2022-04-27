package com.company;

import Utility.In;

public class ListSort {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }

        public Node(int value, Node t) {
            this.value = value;
            next = t;
        }
    }

    /**
     * input:
     * output:
     * description:
     */
    public static Node create() {
        Node a = new Node(0, null);
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (In.init(); !In.empty(); ) {
            a.next = new Node(In.getInt(), a.next);
        }
        return a;
    }

    /**
     * input:
     * output:
     * description:
     */
    public static Node sort(Node a) {
        Node t;
        Node u;
        Node x;
        Node b = new Node(0, null);

        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        while (a.next != null) {
            t = a.next;
            u = t.next;
            a.next = u;

            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (x = b; x.next != null; x = x.next) {
                if (x.next.value > t.value) {
                    break;
                }
                t.next = x.next;
                x.next = t;
            }
        }
        return b;
    }

    /**
     * input:
     * output:
     * description:
     */
    public static void print(Node head) {
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (Node t = head.next; t != null; t = t.next) {
            System.out.println(t.value + "");
        }
    }
}

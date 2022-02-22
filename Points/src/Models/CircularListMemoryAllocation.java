package Models;

public class CircularListMemoryAllocation
{
    /**
     * This approach of a circular list allocates memory for fixe-sized nodes.
     * We created an array to hold all of the nodes that our program will use, all linked together.
     *
     */
    public static class Node {
        int value;
        int next;
    }

    static Node M[];
    static int free, max = 10000;

    public CircularListMemoryAllocation()
    {
        M = new Node[max+1];
        for (int i = 0; i < max; i++)
        { M[i] = new Node(); M[i].next = i+1; }
        M[max] = new Node(); M[max].next = 0;
        free = 0;
    }

    /**
     * input:
     * output:
     * description:
     */
    public Node next(Node x){
        return M[x.next];
    }

    /**
     * input:
     * output:
     * description:
     */
    public int value(Node x){
        return x.value;
    }

    /**
     * input:
     * output:
     * description:
     */
    public Node insert(Node x, int v){
        int i = free;
        free = M[free].next;

        M[i].value = v;
        if (x == null) {
            M[i].next = i;
        }
        else {
            M[i].next = x.next;  x.next = i;
        }
        return M[i];
    }

    /**
     * input:
     * output:
     * description:
     */
    public void remove(Node x){
        int i = x.next; x.next = M[i].next;
        M[i].next = free; free = i;
    }
}
package Models;

public class GenericNode {
    /**
     * For now we will be directly manipulating list for insertion and deletion.
     * We will eventually be adding subroutines that will do this for us.
     * For now we will be directly removing nodes in out list with the following notation
     * Remove Node:
     *      temp = x.next;
     *      x.next = temp.next; or simply
     *      x.next = x.next.next;
     *
     * Insert Node
     *      temp.next = x.next;
     *      x.next = temp;
     *
     */
    public Object item;
    public GenericNode next;  // Link variable
    public int value;


    public GenericNode(Object value) {
        item = value;
        next = null;
    }

    public GenericNode(int value, GenericNode t) {
        this.value = value;
        next = t;
    }


    public static GenericNode reverse(GenericNode x){
        /**
         * This method reverses the links in a list, return a pointer to the final node,
         * which then points  to the next-to-final node, and so fourth, with the link in the
         * first node of the original list set to null. To accomplish this task, we need to
         * maintain links to three consecutive nodes in the list.
         */

        GenericNode t;

        // a pointer to the portion of the list not seen yet.
        GenericNode y = x;

        // a pointer to the position of the list already processed.
        GenericNode r = null;
        while(y != null){
            t = y.next;
            y.next = r;
            r = y;
            y = t;
        }
        return r;
    }

}

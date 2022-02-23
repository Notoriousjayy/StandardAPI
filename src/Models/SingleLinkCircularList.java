package Models;

public class SingleLinkCircularList {

    /**
     * Input: a node
     * Output: the next node in the list
     * Description:
     */
    SingleLinkNode next(SingleLinkNode x){
        return x.next;
    }

    /**
     * Input: a node
     * Output: the value of the node
     * Description: returns the value of the node
     */
    int val(SingleLinkNode x){
        return x.info;
    }
    /**
     * Input: a node and a value
     * Output: the next node in the list
     * Description: inserts a new node and its value into a list
     */
    SingleLinkNode insert(SingleLinkNode previousSingleLinkNode, int value){
        SingleLinkNode newSingleLinkNode = new SingleLinkNode(value);
        if (previousSingleLinkNode == null) {
            newSingleLinkNode.next = newSingleLinkNode;
        }
        else {
            newSingleLinkNode.next = previousSingleLinkNode.next;
            previousSingleLinkNode.next = newSingleLinkNode;
        }
        return newSingleLinkNode;
    }

    /**
     * Input: a node
     * Output: none
     * Description: removes a node from the list
     */
    void remove(SingleLinkNode head){
        head.next = head.next.next;
    }

    /**
     * Input: the current head of a list
     * Output: the circular-list represented to the console
     * Description: Prints the circular list
     */
    static void printList(SingleLinkNode head)
    {
        if (head == null) {
            return;
        }

        SingleLinkNode temp = head;
        do
        {
            System.out.print( temp.info + " ");
            temp = temp.next;
        } while (temp != head);
    }

    /**
     * Input: The current head of a list
     * Output: The list in reverse order
     * Description: Reverses the linked list
     */
    static SingleLinkNode reverse(SingleLinkNode head)
    {
        // if list is empty
        if (head == null)
            return null;

        // reverse procedure same as reversing a
        // singly linked list
        SingleLinkNode previous = null;
        SingleLinkNode current = head;
        SingleLinkNode next;
        do
        {
            // This is a reference to the next node to visit in the list
            next = current.next;

            // This updates the current nodes next link to the
            // previously traversed (visited) node
            current.next = previous;

            // This updates previous link to the node we just traversed
            previous = current;

            // sets the new current node to the next item in the list
            current = next;
        } while (current != (head));

        // adjutsing the links so as to make the
        // last node point to the first node
        (head).next = previous;
        head = previous;
        return head;
    }
}
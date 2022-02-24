package Models;

public class SingleLinkNode {

    private int info;               // data

    private SingleLinkNode next;    // Link variable

    SingleLinkNode(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public SingleLinkNode getNext() {
        return next;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }
}

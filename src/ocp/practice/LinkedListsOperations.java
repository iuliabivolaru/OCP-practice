package ocp.practice;

/**
 * Created by iuliab on 05.01.2018.
 */
public class LinkedListsOperations {

    static NodeLL reverse(NodeLL head) {
        if(head == null || head.next == null)
            return head;
        NodeLL remaining = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return remaining;
    }

    public static void main(String[] args) {
        NodeLL node3 = new NodeLL(3, null);
        NodeLL node2 = new NodeLL(2, node3);
        NodeLL list = new NodeLL(1, node2);
        System.out.println(reverse(list));
    }
}

class NodeLL {
    int data;
    NodeLL next;

    public NodeLL(int data, NodeLL next) {
        this.data = data;
        this.next = next;
    }
}


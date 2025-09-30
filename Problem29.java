class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeSortedLists {

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(-1); // dummy node
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // attach remaining part
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next; // head of merged list
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First list: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Second list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(l1);
        System.out.println("List 2:");
        printList(l2);

        Node merged = mergeTwoLists(l1, l2);
        System.out.println("Merged Sorted List:");
        printList(merged);
    }
}

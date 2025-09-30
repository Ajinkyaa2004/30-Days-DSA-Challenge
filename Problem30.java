//  Remove duplicates from a linked list

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveDuplicatesSorted {

    public static Node removeDuplicates(Node head) {
        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next; // skip duplicate
            } else {
                curr = curr.next; // move ahead
            }
        }

        return head;
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
        // List: 1 -> 1 -> 2 -> 3 -> 3
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}

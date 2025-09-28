// Detect a cycle in a linked list

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class DetectCycle {

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {
        // Example 1: List with cycle
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = head1.next; // cycle (3 -> 2)

        // Example 2: List without cycle
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);

        System.out.println("List 1 has cycle? " + hasCycle(head1));
        System.out.println("List 2 has cycle? " + hasCycle(head2));
    }
}

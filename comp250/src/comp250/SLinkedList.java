package comp250;

import java.util.ArrayList;

public class SLinkedList {
    private SNode head;

    public SLinkedList() {
        this.head = null;
    }

    public SLinkedList(SNode h) {
        this.head = h;
    }

    // Adds an element to the front of the list
    public void addFirst(Integer element) {
        SNode newNode = new SNode(element);

        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to detect and return the first node in the loop using an ArrayList
    public SNode findLoopUsingList() {
        ArrayList<SNode> visitedNodes = new ArrayList<>();  // To store visited nodes

        SNode current = head;
        while (current != null) {
            // If the current node is already in the visitedNodes list, a loop is found
            if (visitedNodes.contains(current)) {
                return current;  // This is the first node in the loop
            }

            // Otherwise, add the current node to the list and continue
            visitedNodes.add(current);
            current = current.next;
        }

        // If we reach the end of the list, there is no loop
        return null;
    }

    public void displayNNodes(int n) {
        SNode cur = this.head;
        int i = 0;

        while (i < n && cur != null) {
            System.out.println(" Element: " + cur.element);
            cur = cur.next;
            i++;
        }
    }

    // SNode class
    private class SNode {
        private Integer element;
        private SNode next;

        SNode(Integer element) {
            this.element = element;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        // First list - no loop
        SNode head1 = list.new SNode(10);
        SNode cur = head1;
        for (int i = 0; i < 8; i++) {
            SNode newNode = list.new SNode(i);
            cur.next = newNode;
            cur = newNode;
        }
        SLinkedList listOne = new SLinkedList(head1);

        // Second list - has a loop
        SNode head2 = list.new SNode(10);
        cur = head2;
        for (int i = 0; i < 8; i++) {
            SNode newNode = list.new SNode(i);
            cur.next = newNode;
            cur = newNode;
        }
        cur.next = head2;  // Creating a loop
        SLinkedList listTwo = new SLinkedList(head2);
        // Detect loop in listTwo using ArrayList
        SNode loopNode = listOne.findLoopUsingList();
        if (loopNode != null) {
            System.out.println("Loop detected at node with element: " + loopNode.element);
        } else {
            System.out.println("No loop detected");
        }
    }
}

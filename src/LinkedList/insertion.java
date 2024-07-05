package LinkedList;
import java.util.*;

public class insertion {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        Node head;
        Node tail;

        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            System.out.println("Node with data " + data + " added to singly linked list");
        }

        public void display() {
            Node current = head;
            if (current == null) {
                System.out.println("The list is empty");
                return;
            }
            System.out.print("Singly Linked List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertion listManager = new insertion();
        SinglyLinkedList sList = listManager.new SinglyLinkedList();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);

        sList.display();
    }
}

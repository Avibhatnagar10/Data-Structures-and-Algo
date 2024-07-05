import java.util.List;
import java.util.*;

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
public class CycleDetection {

    public static boolean hasCycle(Node head) {
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (slow == fast) {
                    return true;
                }
            }

                return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // Generate a random linked list with 10 nodes, values between 1 and 100
        LinkedList randomList = LinkedList.generateList(size);
        // Print the random linked list

        System.out.println(hasCycle(randomList.head)?"1":0);

    }
    }




class LinkedList {
    Node head;

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Generate a random linked list with a given size and value range
    public static LinkedList generateRandomList(int size, int minValue, int maxValue) {
        LinkedList list = new LinkedList();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int randomValue = rand.nextInt((maxValue - minValue) + 1) + minValue;
            list.add(randomValue);
        }
        return list;
    }

    public static LinkedList generateList(int size) {
        LinkedList list = new LinkedList();
        Scanner sc  =new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        return list;
    }


}



//    public class solution {
//        public boolean hasCycle(ListNode head) {
//            ListNode fast = head;
//            ListNode slow = head;
//
//            while (fast != null && fast.next != null) {
//                fast = fast.next.next;
//                slow = slow.next();
//
//                if (slow == fast) {
//                    return true;
//                }
//
//                return false;
//            }
//
//
//        }
//    }

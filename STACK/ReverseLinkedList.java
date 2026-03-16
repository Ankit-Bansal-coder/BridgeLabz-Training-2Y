package Stack;
import java.util.Stack;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void reverseUsingStack() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.printList();
        list.reverseUsingStack();
        list.printList();
    }
}
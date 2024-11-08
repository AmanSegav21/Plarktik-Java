// LinkedListDeclaration.java
import java.util.LinkedList;

public class LinkedListDeclaration {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public LinkedListDeclaration() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
    }

    public void displayLinkedList() {
        System.out.print("Linked List: ");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

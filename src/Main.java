import LinkedList.LinkedList;

public class Main
{
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.prepend(0);

        myLinkedList.set(2,4);

        myLinkedList.printList();
    }
}
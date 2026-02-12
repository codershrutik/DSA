import LinkedList.LinkedList;

public class Main
{
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // Returns Node 2
        System.out.println(myLinkedList.removeLast());
        // Returns Node 1
        System.out.println(myLinkedList.removeLast());
        // Returns null
        System.out.println(myLinkedList.removeLast());
    }
}
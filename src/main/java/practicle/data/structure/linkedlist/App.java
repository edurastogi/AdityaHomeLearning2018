package practicle.data.structure.linkedlist;

public class App {
    public static void main(String[] args) {
        App app = new App();

        //Test Manual List
       //app.testManaulSinglyList();

        //test single linked list
        app.testSinglyLinkedList();
    }

    public void testSinglyLinkedList(){
        SinglyLinkedList myList = new SinglyLinkedList();

        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(99999);

        myList.displayList();
    }

    public static int listLength(Node node) {
        int length = 0;
        Node current = node;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void testManaulSinglyList(){
        Node manualListFist = manualSingleLinkedList();
        System.out.println(listLength(manualListFist));
    }

    public Node manualSingleLinkedList(){

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        nodeA.data = 4;
        nodeB.data = 3;
        nodeC.data = 7;
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        return  nodeA;
    }
}

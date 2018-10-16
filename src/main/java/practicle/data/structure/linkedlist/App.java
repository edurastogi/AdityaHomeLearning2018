package practicle.data.structure.linkedlist;

public class App {
    public static void main(String[] args) {

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
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeC));
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
}

package practicle.data.structure.linkedlist;

public class Node {
    int data;
    Node next = null;
    Node previous = null;

    public void displayNode(){
        System.out.print("{ "+ data + " }");
    }
}

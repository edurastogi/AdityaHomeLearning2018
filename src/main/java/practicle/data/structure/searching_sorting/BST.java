package practicle.data.structure.searching_sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {
    private Node root;

    public void insert(int key, String value) {

        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {

            Node current = root; // traversal variable
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) { // it's parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {

        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        //searching to find the node with the key to delete
        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if (currentNode == null) {
                return false;
            }
        }
        //found the node
        Node nodeToDelete = currentNode;

        //if node is a leaf
        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } else if (nodeToDelete.rightChild == null) { // if node has one child that is on the left
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        } else if (nodeToDelete.leftChild == null) { //if node has one child that is the right
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        } else {// if node has 2 children (tricky)
            Node successer = getSuccessor(nodeToDelete);
            //connect parent of nodeToDelete to successor instead
            if (nodeToDelete == root) {
                root = successer;
            } else if (isLeftChild) {
                parentNode.leftChild = successer;
            } else {
                parentNode.rightChild = successer;
            }
            successer.leftChild = nodeToDelete.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; // go to right child

        while (current != null) { // start going left down the tree until node has no left child
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        // if successor is not a right child
        if (successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }

    public void displayTreeMyImplementation() {

        if (root == null) return;

        List<Node> nodeList = new ArrayList<>();
        nodeList.add(root);

        while (true) {
            List<Node> tempList = new ArrayList<>();

            for (Node tempNode : nodeList) {
                System.out.print("\t" +tempNode.key + "\t");

                if (tempNode.leftChild != null) {
                    tempList.add(tempNode.leftChild);
                }
                if (tempNode.rightChild != null) {
                    tempList.add(tempNode.rightChild);
                }
            }
            if (tempList.size() == 0) break;
            nodeList = tempList;
            System.out.println();
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");

        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }

            while(globalStack.isEmpty()==false) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
            nBlanks = nBlanks/2;

            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        }
        System.out.println( "......................................................");

    }
}

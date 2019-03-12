public class Node {
    int value;
    Node leftChild;
    Node rightChild;


    public Node(int value){

        this.value = value;
        leftChild = null;
        rightChild = null;

    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }


    public void printNode(Node node) throws NullPointerException {

        System.out.println("Parent: " + node.value);

        if(node.leftChild != null) {
            System.out.println("Left child: " + node.leftChild.value);

        }
        if(node.rightChild != null) {
            System.out.println("Right child: " + node.rightChild.value);

        }

        if (node.leftChild == null && node.rightChild == null){
            System.out.println(" ");
        }

    }

}
public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }


    public void addNode(int value) {

        Node newNode = new Node(value);

        if(root == null) {
            // If there is no root, make this the root
            root = newNode;

        } else {

            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;

                // If the value is smaller than the parent's place it on the left side
                if( value < focusNode.value) {

                    focusNode = parent.leftChild;

                    if(focusNode == null) {

                        parent.leftChild = newNode;
                        return;
                    }
                }
                // If the value is greater than the parent's place it on the right side
                else {

                    focusNode = parent.rightChild;

                    if(focusNode == null) {

                        parent.rightChild = newNode;
                        return;
                    }

                }

            }


        }

    }

    public Node findNode(int value) {
        // Start from the root and keep going down until the number is found
        Node focusNode = root;

        while (focusNode.value != value) {

            if (value < focusNode.value) {

                focusNode = focusNode.leftChild;

            } else {

                focusNode = focusNode.rightChild;

            }

            if(focusNode == null) {

                return null;
            }

        }

        return focusNode;

    }



    public void printTree() {

        Node focusNode = root;
        Node parent;
        System.out.println("Root");

        focusNode.printNode(focusNode);

        boolean isTrue = true;

        while(isTrue == true){

            parent = focusNode;
            if (focusNode.leftChild != null) {

                focusNode = parent.leftChild;
                focusNode.printNode(focusNode);
            }

            if (focusNode.rightChild != null) {

                focusNode = parent.rightChild;
                focusNode.printNode(focusNode);
            }
            else {
                isTrue = false;
            }

        }

    }


}


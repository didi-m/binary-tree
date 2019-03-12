import org.testng.Assert;
import org.testng.annotations.Test;


public class BinaryTreeTest {

    @Test
    public void binaryTreeOperations() {
        BinaryTree tree = new BinaryTree();

        final int[] actual = {6, 4, 8, 3, 5, 7, 11};


        // Test addNode method
        for (int i = 0; i < actual.length; i++) {

            //tree.addNode(actual[i]);
            //Assert.assertEquals(tree.findNode(actual[i]).getValue(), actual[i]);

            switch (i) {
                case 1:
                    tree.addNode(6);
                    Assert.assertEquals(tree.getRoot().getValue(), 6);
                    break;
                case 2:
                    tree.addNode(4);
                    Assert.assertEquals(tree.findNode(6).getLeftChild().getValue(), 4);
                    break;
                case 3:
                    tree.addNode(8);
                    Assert.assertEquals(tree.findNode(6).getRightChild().getValue(), 8);
                    break;
                case 4:
                    tree.addNode(3);
                    Assert.assertEquals(tree.findNode(4).getLeftChild().getValue(), 3);
                    break;
                case 5:
                    tree.addNode(5);
                    Assert.assertEquals(tree.findNode(4).getRightChild().getValue(), 5);
                    break;
                case 6:
                    tree.addNode(7);
                    Assert.assertEquals(tree.findNode(8).getLeftChild().getValue(), 7);
                    break;
                case 7:
                    tree.addNode(11);
                    Assert.assertEquals(tree.findNode(8).getRightChild().getValue(), 11);
                    break;
            }
        }


        // Test findNode method
        Node isChildToParent = tree.findNode(6).getLeftChild();

        Assert.assertEquals(tree.findNode(4), isChildToParent);


        tree.printTree();


    }


}

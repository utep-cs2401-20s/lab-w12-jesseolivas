import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {

    @Test
    void myBinarySearchTreeNodeTester1(){
        int[] test = {1,2,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        tree.insert(4);
        assertEquals(4, tree.size());
    }

}
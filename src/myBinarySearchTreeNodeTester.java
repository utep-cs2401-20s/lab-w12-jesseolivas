import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {

    @Test
    /*
    This test is the easiest way I've come up with to test the Insert method. I created a mBSTN
    instance called tree with an array of 3 integers and called my assertEquals test method with
    an expected return value of 3, then implemented the Insert method to add one more element and
    called the assertEquals method once more with an expected return value of 4. This worked flawlessly
    and returned the correct amount both times using the required size method.
     */
    void myBSTNTInsert(){
        int[] test = {1,2,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(3, tree.size());
        tree.insert(4);
        assertEquals(4, tree.size());
    }

    @Test
    /*
    This test is a simple way to test the height method when every element is one value greater
    than previous. I created a mBSTN instance called tree with an array of 8 integers in ascending
    order and called my assertEquals test method with an expected return value of 8 since every
    element would create a new level by BST rules. The test passed and basic functionality of this
    method was confirmed.
     */
    void myBSTNTHeight1(){
        int[] test = {1,2,3,4,5,6,7,8};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(8, tree.height());
    }

    @Test
    /*
    This test was another height test except I created an instance of the mBSTN with an array of
    integers that would completely fill each level and would create a tree with a height of 3. The
    test is used to make sure the logic of the method was correct and not only iterating at each element.
    The test passed and proved the logic works for any given array of integers.
     */
    void myBSTNTHeight2(){
        int[] test = {0,1,1,2,2,2,2};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(3, tree.height());
    }

    @Test
    /*
    This test was made to test the depth method with an instance of mBSTN that has an array of
    integers that completely fills each level and has a total tree depth of 3. The search element
    that was given is the value 3 and it's supposed to give the correct depth of where the first
    value 3 is present in the tree as that is its basic functionality. The test passed and deemed
    usable when the value is present in the BST.
     */
    void myBSTNTDepth1(){
        int[] test = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(3, tree.depth(3));
    }

    @Test
    /*
    This second depth test was used to test if the method would work with the same instance of mBSTN
    but the search value that is given is not present in the BST. The method is written to return a
    value of -1 in this case, signifying that the value given to search is not present. The test passed
    and tells us the method behaves as it should.
     */
    void myBSTNTDepth2(){
        int[] test = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(-1, tree.depth(4));
    }

    @Test
    /*
    This first size test is a very basic test using an instance of mBSTN that has an array of
    integers with 3 elements. By the way the logic is written, the size method should return
    the number of elements in the BST which is 3. The test passed and has been very reliable
    throughout the testing process.
     */
    void myBSTNTSize1(){
        int[] test = {1,2,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        assertEquals(3, tree.size());
    }

    @Test
    /*
    This second test for the size method uses the same instance of mBSTN as in the first
    size test but it will be also using the insert method to see how the method reacts
    when given a repeated value. This tests both insert and size since insert should
    not allow a value that's already in the BST to be inserted and the method size should
    not count it. I added the value 4 using the insert method 5 times, but it should only
    be counted one time, expecting a total of 4 elements in the BST at its most updated
    state. The test passed and shows that the insert method and size method both work and
    are capable of testing each other for functionality.
     */
    void myBSTNTSize2(){
        int[] test = {1,2,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(test);
        tree.insert(4);
        tree.insert(4);
        tree.insert(4);
        tree.insert(4);
        tree.insert(4);
        assertEquals(4, tree.size());
    }



}
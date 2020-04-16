class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  // BASICALLY a default constructor but not really
  myBinarySearchTreeNode(int inValue){
    myValue = inValue;
    left = null;
    right = null;
  }

  // Constructor that takes an array of integers to populate the tree with nodes
  // of type mBSTN
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.

    // Creates a new node of type myBinarySearchTreeNode
    myValue = A[0];

    // Fills up tree with the values from given array A
    for(int i = 1; i < A.length; i++){
      insert(A[i]);
    }

  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken. 

    // Compare inValue to this.myValue of the mBSTN

    // RIGHT COMPARISON START
    if(inValue > myValue){ // Check if value being inserted is greater than value starting on

      if(right == null){ // Make a new node on the right if nothing's there
        right = new myBinarySearchTreeNode(inValue);
      }

      else{ // recursive call to move onto the right node and check again
        right.insert(inValue);
      }
    }
    // RIGHT COMPARISON END

    // LEFT COMPARISON START
    else if(inValue < myValue) { // Check if value being inserted is less than value starting on

      if(left == null){ // Make a new node on the left if nothing's there
        left = new myBinarySearchTreeNode(inValue);
      }

      else{ // recursive call to move onto the left node and check again
        left.insert(inValue);
      }
    }
    // LEFT COMPARISON END
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time

    // Iterators for left and right edges
    int l = 0;
    int r = 0;

    // Checks if left present, then recursively calls with left
    if(left != null){
      l = left.height();
    }

    // Checks if right present, then recursively calls with right
    if(right != null){
      r = right.height();
    }

    // Finally, returns the largest of the two as being iterated recursively
     return Math.max(l,r) + 1;
  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    // Iterator for depth
    int d = 0;

    // Check for a left node to be present
    if(left != null){

      // Left node present, if search less than myValue, continue to left and iterate
      if(search < myValue){
        d = left.depth(search) +1;
      }
    }

    // Check for a right node to be present
    else if(right != null){

      // Right node present, if search greater than myValue, continue to right and iterate
      if(search > myValue){
        d = right.depth(search) +1;
      }
    }

    // If search value found return 0 + all the other iterations, and you're done
    else if(search == myValue){
      return d;
    }

    // Final check, if search value not in tree, return -1
    return -1;
  }

  // This method recursively calculates the number of nodes in the (sub)tree.
  public int size(){
    int size = 1; // the one being called exists so already 1 for sure

    if(left != null){ // Recursive call to check left and increment when needed
      size += left.size();
    }

    if(right != null){ // Recursive call to check right and increment when needed
      size += right.size();
    }

    // base case, returns total of size after recursive cases are not visited anymore
    return size;
  }

  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

} 

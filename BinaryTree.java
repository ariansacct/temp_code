public class BinaryTree<T> {
  BinaryTreeNode<T> root;

  public BinaryTree<T>(T root) {
    this.root = root;
  }

  public BinaryTree() {
    root = null;
  }

  public void insert(T newKey) {
    BinaryTreeNode btn = root;
    BinaryTreeNode parent = null;
    while (btn != null) {
      if (newKey > btn.key) {
        
      }
    }
  }
}


public static int getHeight(Node root) {

    int leftHeight = 0;
    int rightHeight = 0;

    if (root.left != null) {
        leftHeight = 1 + getHeight(root.left);
    }

    if (root.right != null) {
        rightHeight = 1 + getHeight(root.right);
    }

    return leftHeight > rightHeight ? leftHeight : rightHeight;
}
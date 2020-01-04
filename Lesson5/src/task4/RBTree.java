package task4;

public class RBTree {
    Node root;

    void addNode(int element) {
        Node newNode = new Node(element);
        root = addIntoTree(root, newNode);

        fixTree(newNode);
    }

    private Node addIntoTree(Node root, Node node) {
        if(root == null) return node;
        if(node.getElement() < root.getElement()) {
            root.setLeft(addIntoTree(root.getLeft(), node));
            root.getLeft().setParent(root);
        }
        else if(node.getElement() > root.getElement()) {
            root.setRight(addIntoTree(root.getRight(), node));
            root.getRight().setParent(root);
        }
        return root;
    }

    private void rightRotation(Node node) {
        System.out.println("Rotating to the right on node " + node);

        Node tempLeftNode = node.getLeft();
        node.setLeft(tempLeftNode.getRight());
        if(node.getLeft() != null)
            node.getLeft().setParent(node);

        tempLeftNode.setParent(node.getParent());
        if(tempLeftNode.getParent() == null)
            root = tempLeftNode;
        else if(node == node.getParent().getLeft())
            node.getParent().setLeft(tempLeftNode);
        else
            node.getParent().setRight(tempLeftNode);

        tempLeftNode.setRight(node);
        node.setParent(tempLeftNode);
    }

    private void leftRotation(Node node) {
        System.out.println("Rotating to the left on node " + node);

        Node tempRightNode = node.getRight();
        node.setRight(tempRightNode.getLeft());
        if(node.getRight() != null)
            node.getRight().setParent(node);

        tempRightNode.setParent(node.getParent());
        if(tempRightNode.getParent() == null)
            root = tempRightNode;
        else if(node == node.getParent().getLeft())
            node.getParent().setLeft(tempRightNode);
        else
            node.getParent().setRight(tempRightNode);

        tempRightNode.setLeft(node);
        node.setParent(tempRightNode);
    }

    private void fixTree(Node node) {
        Node parent;
        Node grandParent;

        while (node != root && node.getColor() != NodeColor.BLACK && node.getParent().getColor() == NodeColor.RED) {
            parent = node.getParent();
            grandParent = node.getParent().getParent();

            if(parent == grandParent.getLeft()) {
                Node uncle = grandParent.getRight();
                if(uncle != null && uncle.getColor() == NodeColor.RED) {
                    grandParent.setColor(NodeColor.RED);
                    parent.setColor(NodeColor.BLACK);
                    uncle.setColor(NodeColor.BLACK);
                    node = grandParent;
                } else {
                    if(node == parent.getRight()) {
                        leftRotation(parent);
                        node = parent;
                        parent = node.getParent();
                    }
                    rightRotation(grandParent);
                    NodeColor tempColor = parent.getColor();
                    parent.setColor(grandParent.getColor());
                    grandParent.setColor(tempColor);
                    node = parent;
                }
            } else {
                Node uncle = grandParent.getLeft();
                if(uncle != null && uncle.getColor() == NodeColor.RED) {
                    grandParent.setColor(NodeColor.RED);
                    parent.setColor(NodeColor.BLACK);
                    uncle.setColor(NodeColor.BLACK);
                    node = grandParent;
                } else {
                    if(node == parent.getLeft()) {
                        rightRotation(parent);
                        node = parent;
                        parent = node.getParent();
                    }
                    leftRotation(grandParent);
                    NodeColor tempColor = parent.getColor();
                    parent.setColor(grandParent.getColor());
                    grandParent.setColor(tempColor);
                    node = parent;
                }
            }
        }
        if(root.getColor() == NodeColor.RED)
            root.setColor(NodeColor.BLACK);
    }

    void inOderTraverseNode(Node focusNode) {
        if(focusNode != null) {
            inOderTraverseNode(focusNode.getLeft());
            System.out.println(focusNode);
            inOderTraverseNode(focusNode.getRight());
        }
    }


}

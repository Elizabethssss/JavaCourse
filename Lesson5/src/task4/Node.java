package task4;

public class Node {
    private Node right, left;
    private Node parent;
    private NodeColor color;
    private int element;

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public NodeColor getColor() {
        return color;
    }

    public void setColor(NodeColor color) {
        this.color = color;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node(int element) {
        this.element = element;
        this.color = NodeColor.RED;
    }

    @Override
    public String toString() {
        return "" + element + color;
    }
}

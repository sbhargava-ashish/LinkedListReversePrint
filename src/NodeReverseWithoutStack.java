public class NodeReverseWithoutStack {

    private int value;

    private NodeReverseWithoutStack next;

    public NodeReverseWithoutStack(int value, NodeReverseWithoutStack nodeReverseWithoutStack) {
        this.value = value;
        this.next = nodeReverseWithoutStack;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        NodeReverseWithoutStack nodeReverseWithoutStack3 = new NodeReverseWithoutStack(3, null);
        NodeReverseWithoutStack nodeReverseWithoutStack2 = new NodeReverseWithoutStack(2, nodeReverseWithoutStack3);
        NodeReverseWithoutStack nodeReverseWithoutStack1 = new NodeReverseWithoutStack(1, nodeReverseWithoutStack2);
//        nodeReverseWithoutStack1.printReverse();
        nodeReverseWithoutStack1.findNthElement();
    }

    private void printReverse() {
        print(this);
    }

    private void print(NodeReverseWithoutStack node) {
        if(node == null)
            return;

        print(node.next);
        System.out.println(node.value);
    }

    private NodeReverseWithoutStack findNthElement() {
        int len = 0;
        NodeReverseWithoutStack head = this;

        while(head.next != null) {
            len += 1;
            head = head.next;
        }


        System.out.println(len);

        return null;
    }

}

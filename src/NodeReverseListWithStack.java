import java.util.Stack;

public class NodeReverseListWithStack {

    private int value;

    private NodeReverseListWithStack next;

    public NodeReverseListWithStack(int value, NodeReverseListWithStack node) {
        this.value = value;
        this.next = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        NodeReverseListWithStack nodeReverseListWithStack3 = new NodeReverseListWithStack(3, null);
        NodeReverseListWithStack nodeReverseListWithStack2 = new NodeReverseListWithStack(2, nodeReverseListWithStack3);
        NodeReverseListWithStack nodeReverseListWithStack1 = new NodeReverseListWithStack(1, nodeReverseListWithStack2);
        nodeReverseListWithStack1.printReverse();
    }

    private void printReverse() {
        Stack<Integer> stack = new Stack<>();
        print(this, stack);
        int length = stack.size();
        for(int i = 0; i < length; i++) {
            System.out.println(stack.pop());
        }

    }

    private void print(NodeReverseListWithStack node, Stack<Integer> stack) {
        if (node != null) {
            stack.add(node.value);
            print(node.next, stack);
        }
    }

    private void storeToStackAndPrint(NodeReverseListWithStack nodeReverseListWithStack, Stack<Integer> stack) {

    }
}

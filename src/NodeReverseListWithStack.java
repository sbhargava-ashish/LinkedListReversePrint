import java.util.Stack;

public class NodeReverseListWithStack {

    private int value;

    private NodeReverseListWithStack next;

    public NodeReverseListWithStack(int value, NodeReverseListWithStack nodeReverseListWithStack) {
        this.value = value;
        this.next = nodeReverseListWithStack;
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

    private void print(NodeReverseListWithStack nodeReverseListWithStack, Stack<Integer> stack) {
        if (nodeReverseListWithStack != null) {
            stack.add(nodeReverseListWithStack.value);
            print(nodeReverseListWithStack.next, stack);
        }
    }

    private void storeToStackAndPrint(NodeReverseListWithStack nodeReverseListWithStack, Stack<Integer> stack) {

    }
}

package Stack;
class StackArray {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;
    void resize() {
        int newMax = max + (max / 2);
        int[] newStack = new int[newMax];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        max = newMax;
    }
    void push(int value) {
        if ((top + 1) >= (0.6 * max)) {
            resize();
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }
    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
    }
}
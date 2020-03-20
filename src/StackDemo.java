public class StackDemo {
    public static void main(String args[]){
       Stack stack=new Stack();
       stack.show();
       stack.push(10);
       stack.push(20);
       stack.show();
       stack.pop();
       stack.pop();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.show();
        stack.push(20);

    }
}

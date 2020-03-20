public class Stack {
       int []stack=new int[5];
       int top=0;
       public void push(int data)
       {
      if(top==5)
      {
          System.out.println("the stack is full");
      }
      else
          {
          stack[top++] = data;
          }
   }
   public void show()
   {
      for(int a:stack)
      {
          System.out.print(a+" ");
      }

   }
    public void pop()
    {
      if(isEmpty())
      {
          System.out.println("the stack is empty");
      }
        else
            {
          top--;
          System.out.println(stack[top] + "this element poped from stack");
          stack[top] = 0;
      }

    }
    public void peek()
    {

      System.out.println("this is the peek element of stack"+stack[top-1]);
    }
    public int size()
    {
      return top;
    }
    public boolean isEmpty()
    {
      return top<=0;
    }
}

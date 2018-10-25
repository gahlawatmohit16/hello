class linkedlist
{
  int data;
  linkedlist next = null;
  linkedlist(int d)
  {
    this.data = d;
    this.next = null;
  }
}

class stack{
  linkedlist head = null;
  void push(int d)
  {
    linkedlist newnode = new linkedlist(d);
    newnode.next = head;
    head = newnode;
  }
  int pop()
  {
    int tempdata = head.data;
    head = head.next;
    return tempdata;
  }
  boolean isEmpty()
  {
     if(head == null)
     {
     return true;
     }
     return false;
  }
}

class queue{
    static stack s1 = new stack();
    static stack s2 = new stack();

    static void insert(int d)
    {
        while(!s1.isEmpty())
        {
          s2.push(s1.pop());
        }
        s1.push(d);
        while(!s2.isEmpty())
        {
          s1.push(s2.pop());
        }
    }
    static int delete()
    {
      if(s1.isEmpty()){System.exit(0);}
      return s1.pop();
    }

  }

class Main
{
  public static void main(String[] args)
  {
    queue obj = new queue();
    obj.insert(1);
    obj.insert(2);
    obj.insert(3);

    System.out.println(obj.delete());
    System.out.println(obj.delete());
    System.out.println(obj.delete());
  }
}
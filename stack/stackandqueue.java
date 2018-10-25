class QueueEmptyException extends Exception{

}

class linkedlist 
{
    int data;
    linkedlist next = null;

    linkedlist(int d) {
    this.data = d;
    this.next = null;
    }
}

class stackusinglinkedlist
{
     linkedlist head = null;
     int c = 0;
  
     void push(int d)
     {
       linkedlist newnode = new linkedlist(d);
       newnode.next = head;
       head = newnode;
       this.c++;
     }

     void pop() 
     {
       if(!this.isEmpty()){
       head = head.next;
       this.c--;
       }
       else {
       System.out.println("Stack is Empty");
       }
     }
 
     int size()
     {
       return c;
     }

     boolean isEmpty()
     {
       if(head == null){
        return true;
       }
       return false;
     }

     int top()
     {
        return head.data;
     }

}

class queue
{
  int front,rear,size;
  int capacity;
  int arr[];

  queue(int c)
  {
    front = 0;
    rear = -1;
    size = 0;
    this.capacity = c;
    arr = new int[c];
  }

  void enqueue(int data)
  {
    if(!isFull()){
    this.size++;
    this.rear++;
    this.arr[this.rear] = data;
    }
    else { System.out.println("Queue is Full");};
  }

  int dequeue()throws QueueEmptyException
  {
    if(!isEmpty()){
      int tempf = this.arr[this.front];
      this.size--;
      this.front++;
      return tempf;
    }
    else throw new QueueEmptyException();
  }

  boolean isFull(){
    if(this.size == this.capacity){ return true;}
    return false;
  }
  
  boolean isEmpty(){
    if(this.size == 0){return true;}
    return false;
  }

  int front() throws QueueEmptyException
  {
    if(isEmpty()){throw new QueueEmptyException();}
    return this.arr[this.front];
  }

  int rear() throws QueueEmptyException
  {
    if(isEmpty()){throw new QueueEmptyException();}
    return this.arr[this.rear];
  }

}

public class Main
{
  public static void main(String[] args) throws QueueEmptyException
  {
    System.out.println("Implementing Queue ");
    queue obj = new queue(5);
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.enqueue(40);
    obj.enqueue(50);
 
    System.out.println(obj.front());
    System.out.println(obj.dequeue());
    System.out.println(obj.front());
    System.out.println(obj.rear());
    System.out.println(obj.dequeue());
    System.out.println(obj.front());
    System.out.println(obj.rear());

    System.out.println("Implementing Stack ");
    stackusinglinkedlist obj1 = new stackusinglinkedlist();
    obj1.push(10);
    obj1.push(20);
    obj1.push(30);
    obj1.push(40);
    obj1.push(50);
    obj1.pop(); 
   
    System.out.println(obj1.size());
    System.out.println(obj1.top());

  }
}
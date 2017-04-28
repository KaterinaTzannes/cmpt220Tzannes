// Katerina Tzannes
// Lab 7
// Version 1
// April 25,2017

/*
  (The Queue class) Section 10.6 gives a class for Stack. Design a class named
  Queue for storing integers. Like a stack, a queue holds elements. In a stack,
  elements are retrieved in a last-in first-out fashion. In a queue, elements 
  retrieved in a first-in first-out fashion. The class contains:
  ■ An int[] data field named elements that stores the int values in the queue.
  ■ A data field named size that stores the number of elements in the queue.
  ■ A constructor that creates a Queue object with default capacity 8.
  ■ The method enqueue(int v) that adds v into the queue.
  ■ The method dequeue() that removes and returns the element from the queue.
  ■ The method empty() that returns true if the queue is empty.
  ■ The method getSize() that returns the size of the queue.
*/

package tzannes_10.pkg10;

public class Tzannes_1010{

  static void main(String[] args){
    Queue queue = new Queue();
    
    for (int i = 0; i < 20; i++){
      queue.enqueue(i);
    }

    for (int i = 0; i < 20; i++){
      System.out.printf("%2d ", queue.dequeue());
      if ((i + 1) % 5 == 0) System.out.printf("\n");
    }
  }
}

public class Queue{
  private int[] elements;
  private int size;
  private int capacity;

  public Queue(int capacity){
    this.capacity = capacity;
    elements = new int[capacity];
  }
  
  public Queue(){
    this(8);
  }
 
  public void enqueue(int v){
    if (size >= elements.length){
      int[] temp = new int[size * 2];
      System.arraycopy(elements, 0, temp, 0, size);
      elements = temp;
    }
    elements[size++] = v;
  }
  
  public int dequeue(){
    int v = elements[0];
    size--;
    for (int i = 0; i < size; i++){
      elements[i] = elements[i + 1];
    }
    return v;
  }
  
  public boolean isEmpty(){
    return size == 0;
  }
  
  public int getSize(){
    return size;
  }

  public int getCapacity(){
    return capacity;
  }
}
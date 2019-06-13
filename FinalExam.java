//Elly, Brent, Nataliia
/*Assignment 1
 * 
 * 
 * O(N^2)
 * 
 * 
 * Assignment 2
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FinalExam {
	
	
		
 public static void main(String[] args) {
	//Test method for Assignment2
	Stack<Integer> s = new Stack<>();
	s.push(67);
	s.push(45);
	s.push(4);
	s.push(56);
	s.push(6);
	s.push(67);
	System.out.println(s);
	Stack<Integer> copy = copyStack(s);
	System.out.println(copy);
	
	//Test method for Assignment3
	LinkedIntList list=new LinkedIntList();
	list.add(18);
	list.add(27);
	list.add(42);
	list.add(3);
	list.add(-1);
	System.out.println(list);
	System.out.println("Is this list sorted? "+ list.isSorted());
	
	
	LinkedIntList list1=new LinkedIntList();
	list1.add(1);
	list1.add(3);
	list1.add(5);
	list1.add(8);
	list1.add(12);
	System.out.println(list1);
	System.out.println("Is this list sorted? "+ list1.isSorted());
	
	
	LinkedIntList list2=new LinkedIntList();
	System.out.println(list2);
	System.out.println("Is this list sorted? "+ list2.isSorted());
	
	
  }
	//writing method copyStack
 public static Stack<Integer> copyStack(Stack<Integer> s){
	 //create new stack
	Stack<Integer> copy = new Stack<Integer>();
	//create storage queue
	Queue<Integer> q = new LinkedList<Integer>();
	//while the stack is not empty
	while(!s.isEmpty()){
		//push to the copy from the stack
	 copy.push(s.pop());
	 
     }
	//while the copy is not empty
	while(!copy.isEmpty()){
	//temp variable for storage
	int number=copy.pop();
	//add number to the storage queue
	q.add(number);
	//move number to the stack
    s.push(number);

    }
	//while the queue is not empty
    while (!q.isEmpty()){
    //remove from queue and add to the copy
    copy.push(q.remove());
   }
   //return the copy stack
   return copy;
   }
 
}
 /*Assignment3 
  */


public boolean isSorted() {
    // getting previous note
    ListNode prev = front;
    //true if list is empty
    if (front == null) {

        return true;

    }
    //checking order elements in the list looping thru elements
        while (prev.next != null) {
        ListNode current = prev.next;//getting current note
         //checking if the previous is larger than current
        if (current.data < prev.data) {
         //if so 
        return false;
        }
        prev = current;
       }
    return true;

       
   }
}

	
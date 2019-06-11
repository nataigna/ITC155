
public class ListNode {
	public int data;// the data store in the node
	public ListNode next;//link to the next node in the list
	
	//construct a node with a data and null link
	public ListNode() {
		this(0,null);
	}

	public ListNode(int data) {
		this(data,null);
	}
	
	public ListNode(int data, ListNode next) {
		this.data =data;
		this.next=next;
	}
	
	

}

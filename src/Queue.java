//A Queue Template by Mark Boady

//The Queue
public class Queue
{
	//The Node Class
	class Node
	{
		public int value;
		public Node next;
	}
	private Node front;
	private Node back;
	//Create A New Queue
	public Queue()
	{
		this.front = null;
		this.back = null;
	}
	//Print out the Queue
	public void print()
	{
		if(this.front==null)
		{
			System.out.println("Queue Empty");
		}else
		{
			System.out.print("FRONT -> ");
			Node current = this.front;
			while(current!=null)
			{
				System.out.print(current.value);
				System.out.print(" -> ");
				current=current.next;
			}
			System.out.println("END");
		}
	}

	//What is at the front of the queue?
	public int front()
	{
		if (this.front == null){
			return 0;
		}
		return this.front.value;
	}

	//Is the Queue empty? true=Yes false=No
	public boolean empty()
	{
		return this.front == null;
	}

	//Add a new item to the back of the Queue
	public void enqueue(int x)
	{
		Node nextNode = new Node();
		nextNode.value = x;
		if (this.back == null) {
			this.front = this.back = nextNode;
			return;
		}
		this.back.next = nextNode;
		this.back = nextNode;
	}

	//Remove an item from the front of the queue
	//Return the item you removed
	public int dequeue()
	{
		if (this.front == null) {
			return 0;
		}
		
		Node temp = this.front;
		this.front = this.front.next;
		
		if (this.front == null) {
			this.back = null;
		}
		return temp.value;
	}
}
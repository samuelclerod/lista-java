
public class LinkedList implements List{
	
	private Node head;

	@Override
	public void add(int value) {
		
		Node newNode = new Node(value);
		
		if(head==null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next==null) {
				current = current.next;
			}
			
			current.next = newNode;
		}
		
	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int position, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}

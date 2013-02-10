
public class LinkedList {

	private Node head;
	
	private Node head2;
	
	private Node c;
	
	public LinkedList() {
		
	}
	
	public void add2(int number) {
		if (head2 == null) {
			head2 = new Node();
			head2.data = number;
		} else {
			Node temp = head2;
		    while (temp.next != null) {
		    	temp = temp.next;
		    }
		    Node node = new Node();
		    node.data = number;
		    temp.next = node;
		}
	}
	
	
	public void add(int number) {
		if (head == null) {
			head = new Node();
			head.data = number;
		} else {
			Node temp = head;
		    while (temp.next != null) {
		    	temp = temp.next;
		    }
		    Node node = new Node();
		    node.data = number;
		    temp.next = node;
		}
	}
	
	public void addFront(int number) {
		if (head == null) {
			head = new Node();
			head.data = number;
		} else {
			Node node = new Node();
			node.data = number;
			node.next = head;
			head = node;
		}
		
	}
	
	public void addByRecursion(int number) {
		Node node = add_recursion(head, number);
		if (head == null) {
			head = node;
		}
	}
	
	private Node add_recursion(Node node, int number) {
		if (node == null) {
			node = new Node();
			node.data = number;
			return node;
		} else {
			node.next = add_recursion(node.next, number);
			return node;
		}
	}
	
	public int getIndex(int number) {
		int index = 0;
		Node temp = head;
		boolean found = false;
		while (temp.next != null) {
			index++;
			if (temp.data == number) {
				found = true;
				break;
			}
			temp = temp.next;
		}
		return found ? index : -1;
	}
	
	public void insertAfter(int index, int number) {
		int i = 0;
		Node temp = head;
		while (temp != null) {
			i++;
			if (i == index) {
				Node node = new Node();
				node.data = number;
				node.next = temp.next;
				temp.next = node;
				break;
			}
			temp = temp.next;
		}
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	public void display2() {
		Node temp = head2;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int count() {
		return countr(head);
	}
	
	private int countr(Node node) {
		int count = 1;
		if (node == null) {
			return 0;
		} else {
			count += countr(node.next);
			return count;
		}
	}

	public void merge(Node h1, Node h2) {
		while (h1 != null || h2 != null) {
	
			if (h1 != null && h2 != null) {
				if (h1.data < h2.data) {
					addc(h1.data);
					addc(h2.data);
				} else {
					addc(h2.data);
					addc(h1.data);
				}
			   h1 = h1.next;
			   h2 = h2.next;
			} else if (h1 != null && h2 == null) {
				addc(h1.data);
				h1 = h1.next;
			} else if (h1 == null && h2 != null) {
				addc(h2.data);
				h2 = h2.next;
			}
		
		}
	}
	
	public void addc(int number) {
		if (c == null) {
			c = new Node();
			c.data = number;
		} else {
			Node temp = c;
		    while (temp.next != null) {
		    	temp = temp.next;
		    }
		    Node node = new Node();
		    node.data = number;
		    temp.next = node;
		}
	}
	
	
	public class Node {
		int data;
		Node next;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		/*ll.addByRecursion(10);
		ll.addByRecursion(20);
		ll.addByRecursion(30);
		ll.addByRecursion(40);*/
		
		
		ll.add(1);
		ll.add(5);
		ll.add(7);
		ll.add(9);
		
		ll.add2(2);
		ll.add2(6);
		ll.add2(8);
		
		
		
		
		/*ll.addFront(50);
		ll.addFront(60);
		ll.insertAfter(5, 70);
		*/
		
		ll.display();
		System.out.println("----");
		ll.display2();
		
		ll.merge();
		
		//System.out.println(ll.count());
		
		//System.out.println("Index="+ll.getIndex(30));

	}

	private void merge() {
		merge(head, head2);
		System.out.println("Merged Result:");
		Node m = c;
		while (m != null) {
			System.out.println(m.data);
			m = m.next;
		}
		
	}

}

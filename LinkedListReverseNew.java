
public class LinkedListReverseNew {

	private Node head;
	
	public LinkedListReverseNew() {
		head = new Node();
		head.num = 1;
		Node second = new Node();
		second.num = 2;
		head.next = second;
		Node third = new Node();
		third.num = 3;
		second.next = third;
		Node four = new Node();
		four.num = 4;
		third.next = four;
		Node five = new Node();
		five.num = 5;
		four.next = five;
		Node six = new Node();
		six.num = 6;
		five.next = six;
		Node seven = new Node();
		seven.num = 7;
		six.next = seven;
		
		reverseSpecial(head);
	}

	public class Node
	{
		int num;
		Node next;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LinkedListReverseNew();

	}
	
	//I/P: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
	//O/P: 7 -> 1 -> 6 -> 2 -> 5 -> 3 -> 4
	public void reverseSpecial(Node node) {
		Node temp = node;
		Node endbefore = null;
		Node head = temp;
		Node newstart = null;
		while (head != null && head.next != null) {
			while (temp != null && temp.next != null) {
				endbefore = temp;
				temp = temp.next;
			}
			if (newstart == null) { //first time
				newstart = temp;
			}
			temp.next = head;
			temp = head.next;
			head.next = endbefore;
			head = temp;
			endbefore.next = null;
		}
		
		while (newstart != null) {
			System.out.println(newstart.num);
			newstart = newstart.next;
		}
     }
	
}

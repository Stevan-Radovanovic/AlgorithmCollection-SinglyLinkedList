
public class MethodCollection {

	/**
	 * @param First node of a singly linked list
	 * @return Sum of all elements
	 */
	public int returnSumOfAllElements(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first;
		int sum = 0;
		
		while(help!=null) {
			sum+=help.number;
			help=help.next;
		}
		
		return sum;
	}
	
	/**
	 * @param First node of a singly linked list
	 * Printing all elements of a singly linked list
	 */
	public void showAllElements(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first;
		
		while(help!=null) {
			System.out.print("["+help.number+"]->");
			help=help.next;
		}
		
		System.out.println("null");
	}
	
	/**
	 * @param First node of a singly linked list
	 * @return Product of all elements
	 */
	public int returnProductOfAllElements(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first;
		int product = 1;
		
		while(help!=null) {
			product*=help.number;
			help=help.next;
		}
		
		return product;		
	}
	
	/**
	 * @param First node of a singly linked list
	 * @return Max element
	 */
	public int returnMaxElement(Node first) {
	
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first.next;
		int max = first.number;
		
		while(help!=null) {
			if(max<help.number) max=help.number;
			help=help.next;
		}
		
		return max;		
	}
	
	/**
	 * @param First node of a singly linked list
	 * @return Min element
	 */
	public int returnMinElement(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first.next;
		int min = first.number;
		
		while(help!=null) {
			if(min>help.number) min=help.number;
			help=help.next;
		}
		
		return min;		
	}
	
	/**
	 * @param First node of a singly linked list
	 * @return First node of a new re-arranged singly linked list
	 */
	public Node FindMinElementAndInsertItAsFirst(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first.next;
		Node min = first;
		
		while(help!=null) {
			if(min.number>help.number) min=help;
			help=help.next;
		}
		
		if(min==first) return first;
		
		help = first;
		while(help.next!=min) help=help.next;
		
		help.next=help.next.next;
		
		min.next = first;
		first = min;
		
		return first;
	}

	/**
	 * @param First node of a singly linked list
	 * @return First node of a new re-arranged singly linked list
	 */
	public Node FindMaxElementAndInsertItAsFirst(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		
		Node help = first.next;
		Node max = first;
		
		while(help!=null) {
			if(max.number<help.number) max=help;
			help=help.next;
		}
		
		if(max==first) return first;
		
		help = first;
		while(help.next!=max) help=help.next;
		
		help.next=help.next.next;
		
		max.next = first;
		first = max;
		
		return first;
	}
	
}

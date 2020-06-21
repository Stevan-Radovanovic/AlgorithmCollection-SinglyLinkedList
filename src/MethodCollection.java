
public class MethodCollection {

	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return sum
	 * Sum of all elements
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
	 * Printing all elements of a singly linked list
	 * @param first
	 * First node of a singly linked list 
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
	 * @param first
	 * First node of a singly linked list 
	 * @return product
	 * Product of all elements
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
	 * @param first 
	 * First node of a singly linked list
	 * @return max
	 * Max element
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
	 * @param first 
	 * First node of a singly linked list
	 * @return min 
	 * Min element
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
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list
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
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	 
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
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 */
	public Node RemoveSecondToLastNode(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		if(first.next==null) throw new RuntimeException("The list has only one element");
		
		Node help = first;
		
		if(first.next.next==null) {
			first=first.next;
			return first;
		}
		
		while(help.next.next.next!=null) help=help.next;
		
		help.next= help.next.next;
		return first;
	}
	
	/**
	 * Note: Making a new singly linked list is allowed
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 */
	public Node ReverseNodeOrder1(Node first) {
		
		if(first==null) throw new RuntimeException("The list is empty");
		if(first.next==null) return first;
		
		Node newFirst = null;
		
		Node help = first;
		while(help!=null) {
			newFirst = new Node(help.number,newFirst);
			help=help.next;
		}
		
		return newFirst;
		
	}
	
}

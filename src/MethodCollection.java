
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
	
 	public static void main(String[] args) {
		//Generate a class
		MethodCollection mc = new MethodCollection();		
		//Creating a list
		Node first = Helper.generateSinglyLinkedList(new int[] {});
		//Testing
		mc.showAllElements(first);
	}

}

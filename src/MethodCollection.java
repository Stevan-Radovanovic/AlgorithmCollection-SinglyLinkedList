public class MethodCollection {
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return sum
	 * Sum of all elements
	 * @throws NodeException 
	 */
	public int returnSumOfAllElements(Node first) throws NodeException {
	
		if(first==null) throw new NodeException("The list is empty");
		
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
		
		if(first==null) {
			System.out.println("Empty list");
			return;
		}
		
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
	 * @throws NodeException 
	 */
	public int returnProductOfAllElements(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
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
	 * @throws NodeException 
	 */
	public int returnMaxElement(Node first) throws NodeException {
	
		if(first==null) throw new NodeException("The list is empty");
		
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
	 * @throws NodeException 
	 */
	public int returnMinElement(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
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
	 * @throws NodeException 
	 */
	public Node findMinElementAndInsertItAsFirst(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
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
	 * @throws NodeException 
	 */
	public Node findMaxElementAndInsertItAsFirst(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
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
	 * @throws NodeException 
	 */
	public Node removeSecondToLastNode(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		if(first.next==null) throw new NodeException("The list has only one element");
		
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
	 * @throws NodeException 
	 */
	public Node reverseNodeOrder1(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		if(first.next==null) return first;
		
		Node newFirst = null;
		
		Node help = first;
		while(help!=null) {
			newFirst = new Node(help.number,newFirst);
			help=help.next;
		}
		
		return newFirst;
		
	}
	
	/**
	 * @param first
	 * First node of a singly linked list 
	 * @return max
	 * Max even element
	 * @throws NodeException 
	 */
	public int returnMaxEvenElement(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		int max = Integer.MIN_VALUE;
		
		while(help!=null) {
			if(max<help.number && help.number%2==0) max=help.number;
			help=help.next;
		}
		
		if(max==Integer.MIN_VALUE) throw new NodeException("The list has no even numbers");
		
		return max;
	}

	/**
	 * @param first
	 * First node of a singly linked list 
	 * @return max
	 * Max odd element
	 * @throws NodeException 
	 */
	public int returnMaxOddElement(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		int max = Integer.MIN_VALUE;
		
		while(help!=null) {
			if(max<help.number && help.number%2!=0) max=help.number;
			help=help.next;
		}
		
		if(max==Integer.MIN_VALUE) throw new NodeException("The list has no odd numbers");
		
		return max;
	}

	/**
	 * @param first
	 * First node of a singly linked list 
	 * @return min
	 * Min even element
	 * @throws NodeException 
	 */
	public int returnMinEvenElement(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		int min = Integer.MAX_VALUE;
		
		while(help!=null) {
			if(min>help.number && help.number%2==0) min=help.number;
			help=help.next;
		}
		
		if(min==Integer.MAX_VALUE) throw new NodeException("The list has no even numbers");
		
		return min;
	}

	/**
	 * @param first
	 * First node of a singly linked list 
	 * @return min
	 * Min odd element
	 * @throws NodeException 
	 */
	public int returnMinOddElement(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		int min = Integer.MAX_VALUE;
		
		while(help!=null) {
			if(min>help.number && help.number%2!=0) min=help.number;
			help=help.next;
		}
		
		if(min==Integer.MAX_VALUE) throw new NodeException("The list has no odd numbers");
		
		return min;
	}

	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeLastNode(Node first) throws NodeException {
		if(first==null) throw new NodeException("The list is empty");
		if(first.next==null) return null;
		
		Node help = first;
				
		while(help.next.next!=null) help=help.next;
		
		help.next= help.next.next;
		return first;
	}
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node putAllNegativeNodesAtTheBeginning(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		if(first.next==null) return first;
		
		Node help = first;
		while(help.next!=null) {
			if(help.next.number<0) {
				first = new Node(help.next.number,first);
				help.next=help.next.next;
			} else
				help=help.next;
		}
		
		return first;
	}
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeAllNegativeNodes(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		
		while(help.next!=null) {
			if(help.next.number<0) 
				help.next=help.next.next;
			else 
				help=help.next;
		}
		
		if(first.number<0) first=first.next;
		if(help.number<0) help=null;
		
		return first;
		
	}
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @param x
	 * Number that should be removed from the singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeAllNodesEqualToX(Node first, int x) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		
		while(help.next!=null) {
			if(help.next.number==x) 
				help.next=help.next.next;
			else 
				help=help.next;
		}
		
		if(first.number==x) first=first.next;
		if(help.number==x) help=null;
		
		return first;
		
	}

	/**
	 * Note: If there are any numbers equal to X, the first instance
	 * of the number should be left
	 * @param first 
	 * First node of a singly linked list
	 * @param x
	 * Number that should be removed from the singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeAllDuplicateNodesEqualToX(Node first, int x) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		boolean firstInstanceFound = false;
		
		if(first.number==x) {
			help=help.next;
			firstInstanceFound = true;
		}
		
		while(help.next!=null) {
			
			if(help.next.number==x && !firstInstanceFound) {
				firstInstanceFound = true;
				help=help.next;
				continue;
			}
				
			if(help.next.number==x && firstInstanceFound) 
				help.next=help.next.next;
			else 
				help=help.next;
		}
		
		if(help.number==x && firstInstanceFound) help=null;
		
		return first;

	}

	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeNextAndPreviousNodeFromMax(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		if(first.next==null) return first;
		
		Node help = first.next;
		Node max = first;
		
		while(help!=null) {
			if(max.number<help.number) max=help;
			help=help.next;
		}
		
		if(max==first) {
			first.next=first.next.next;
			return first;
		}
		
		if(max==first.next) {
			first=first.next;
			if(max.next!=null) 
				max.next = max.next.next;
			return first;
		}
		
		help = first;
		while(help.next.next!=max) help=help.next;
		
		help.next = max;
		
		if(max.next!=null) 
			max.next = max.next.next;
		
		return first;
	}

	/**
	 * Note: List must be sorted ascending
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeDuplicatesFromASortedList(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		
		while(help.next!=null) {
			if(help.number==help.next.number)
				help.next=help.next.next;
			else 
				help=help.next;
			
		}
		
		return first;
	}

	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeTheMiddleNode(Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");
		
		Node help = first;
		int count = 0;
		
		while(help!=null) {
			count++;
			help=help.next;
		}
	
		if(count%2==0)  throw new NodeException("The list has even amount of nodes");
	
		help = first;
		for(int i=1;i<count/2;i++) help=help.next;
		
		help.next=help.next.next;
		
		return first;
	}
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node removeEvenNodesWithOddNeighbours (Node first) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");		
		
		Node help = first.next;
		
		while(help.next.next!=null) {
			if(help.number%2!=0 && help.next.number%2==0 && help.next.next.number%2!=0) {
				help.next=help.next.next;
			} else 
				help=help.next;
		}
		
		return first;
	}
	
	/**
	 * @param first 
	 * First node of a singly linked list
	 * @param x
	 * Number of nodes that should be skipped
	 * @param y
	 * Number of nodes that should be removed
	 * @return first
	 * First node of a new re-arranged singly linked list	
	 * @throws NodeException 
	 */
	public Node moveXPlacesRemoveYNodes (Node first, int x, int y) throws NodeException {
		
		if(first==null) throw new NodeException("The list is empty");		
		if(x<=0 && y<=0) throw new NodeException("Parameters are not in the right format");
		
		Node help = first;
		
		while(true) {
			for(int i=1;i<x;i++) {
				if(help==null) return first;
				help=help.next;
			}
			
			for(int i=1;i<=y;i++) {
				if(help==null) return first;
				if(help.next==null) return first;
				help.next=help.next.next;				
			}
			
			help=help.next;
		}
		
	}

	
	
}

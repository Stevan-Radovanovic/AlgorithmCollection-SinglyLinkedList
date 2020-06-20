
public class MethodCollection {

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
	
	public static void main(String[] args) {

		//Generate a class
		MethodCollection mc = new MethodCollection();
		
		//Creating a list
		Node first = new Node(1,new Node(2, new Node(3, new Node(4, new Node(5,null)))));
		
		//Testing
		System.out.println(mc.returnSumOfAllElements(first));
		
	}

}

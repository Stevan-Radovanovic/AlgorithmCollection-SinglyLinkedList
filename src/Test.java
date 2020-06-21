
public class Test {

 	public static void main(String[] args) {
 		
		//Generate a class
		MethodCollection mc = new MethodCollection();		
		//Creating a list
		Node first = Helper.generateSinglyLinkedList(new int[] {1,2,3,4,-1,-1,-1,-1,-3,5,-4,-4,-4,-4,-4});
		//Testing
		mc.showAllElements(first);
		mc.showAllElements(mc.putAllNegativeNodesAtTheBeginning(first));
	}
}

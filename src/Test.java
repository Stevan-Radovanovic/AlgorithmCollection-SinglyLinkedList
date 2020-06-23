
public class Test {

 	public static void main(String[] args) {
 		
		//Generate a class
		MethodCollection mc = new MethodCollection();		
		//Creating a list
		Node first = Helper.generateSinglyLinkedList(new int[] {2,3,2,3,2,3,2,3,2,3,2,3,2,3,2});
		//Testing
		mc.showAllElements(first);
		mc.showAllElements(mc.removeEvenNodesWithOddNeighbours(first));
	}
}
